package com.insigma.mvc.model;

public class PageDesign extends PageInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String page_name;
	private String page_name2;
	private String page_describe;
	private String serialized_data;
	public String getPage_name() {
		return page_name;
	}
	public void setPage_name(String page_name) {
		this.page_name = page_name;
	}
	public String getPage_name2() {
		return page_name2;
	}
	public void setPage_name2(String page_name2) {
		this.page_name2 = page_name2;
	}
	public String getPage_describe() {
		return page_describe;
	}
	public void setPage_describe(String page_describe) {
		this.page_describe = page_describe;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String isvalid;
	private String designtime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return page_name;
	}
	public void setName(String name) {
		this.page_name = name;
	}
	public String getDescribe() {
		return page_describe;
	}
	public void setDescribe(String describe) {
		this.page_describe = describe;
	}
	public String getSerialized_data() {
		return serialized_data;
	}
	public void setSerialized_data(String serialized_data) {
		this.serialized_data = serialized_data;
	}
	public String getIsvalid() {
		return isvalid;
	}
	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}
	public String getDesigntime() {
		return designtime;
	}
	public void setDesigntime(String designtime) {
		this.designtime = designtime;
	}
	
}
