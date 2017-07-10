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
     * ��ȡ����
     * @param key
     * @return
     * @throws AppException
     */
    public static String getConfig(String key){
        return hashmap.get(key)==null?"":(String)hashmap.get(key);
    }

    /**
     * ���ò���
     * @param key
     * @return
     * @throws AppException
     */
	public static void setConfig(String key,String value){
        hashmap.put(key,value);
    }



    /**
     * ͨ��spring��ȡ����ֵ
     * @param proname
     * @return
     */
    public static String getProperties(String proname){
        return CustomizedPropertyConfigurer.getContextProperty(proname);
    }
}
