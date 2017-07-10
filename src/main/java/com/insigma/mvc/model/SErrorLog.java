package com.insigma.mvc.model;

import java.util.Date;

public class SErrorLog  extends PageInfo implements java.io.Serializable { 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logid;
	private String content;
	private Date logtime;
	
	public SErrorLog(String content){
		this.content=content;
	}
	public String getLogid() {
		return logid;
	}
	public void setLogid(String logid) {
		this.logid = logid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getLogtime() {
		return logtime;
	}
	public void setLogtime(Date logtime) {
		this.logtime = logtime;
	}
}
