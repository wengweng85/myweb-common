package com.insigma.dto;

/**
 * ajax��Ϣ����
 * @author wengsh
 * @date 2012-9-27
 *
 */
public class AjaxReturnMsg {
	private boolean success;//�Ƿ�ɹ�
	private String message;//�����������֮������Ϣ,�ɹ�Ҳ��������ʾ��Ϣ
	private Object obj;//����
	private Long total;//��ҳ�����֮����
	
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
