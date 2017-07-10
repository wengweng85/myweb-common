package com.insigma.common.listener;

import com.insigma.config.CustomizedPropertyConfigurer;
import com.insigma.resolver.AppException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2014-12-25.
 */
public class AppConfig {

	public static Map<String,Object> hashmap=new HashMap<String,Object>();

    /**
     * 获取参数
     * @param key
     * @return
     * @throws AppException
     */
    public static String getConfig(String key){
        return hashmap.get(key)==null?"":(String)hashmap.get(key);
    }

    /**
     * 设置参数
     * @param key
     * @return
     * @throws AppException
     */
	public static void setConfig(String key,String value){
        hashmap.put(key,value);
    }



    /**
     * 通过spring获取属性值
     * @param proname
     * @return
     */
    public static String getProperties(String proname){
        return CustomizedPropertyConfigurer.getContextProperty(proname);
    }
}
