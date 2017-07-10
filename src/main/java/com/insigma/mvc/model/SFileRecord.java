package com.insigma.mvc.model;

import java.util.Date;


/**
 *  文件记录表
 * 
 */
public class SFileRecord implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String file_uuid;
	private String file_name;
	private String file_path;
	private Date file_addtime;
	private String file_md5;
	public String getFile_uuid() {
		return file_uuid;
	}
	public void setFile_uuid(String file_uuid) {
		this.file_uuid = file_uuid;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public Date getFile_addtime() {
		return file_addtime;
	}
	public void setFile_addtime(Date file_addtime) {
		this.file_addtime = file_addtime;
	}
	public String getFile_md5() {
		return file_md5;
	}
	public void setFile_md5(String file_md5) {
		this.file_md5 = file_md5;
	}

}
