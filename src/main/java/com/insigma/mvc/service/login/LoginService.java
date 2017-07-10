package com.insigma.mvc.service.login;


import java.util.Set;

import com.insigma.mvc.model.SUser;
import com.insigma.resolver.AppException;


/**
 * ��¼service�ӿ�
 * @author wengsh
 *
 */
public interface LoginService {
	/**
	 * ͨ���û�����ȡ��Ա����Ϣ
	 * @param username
	 * @return
	 * @throws Exception 
	 */
	public SUser getUser(String loginname);
	
	/**
	 * ͨ���û�id��ȡ�û���ɫ����
	 * @param userid
	 * @return ��ɫ����
	 * @throws Exception 
	 */
	public Set<String> findRolesStr(String loginname) throws AppException, Exception;
	
	/**
	 * ͨ���û�id��ȡ�û�Ȩ�޼���
	 * @param userid
	 * @return Ȩ�޼���
	 * @throws Exception 
	 */
	public Set<String> findPermissionStr(String loginname) throws AppException, Exception;
	

}
