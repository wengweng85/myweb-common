package com.insigma.mvc.service.upload;

import java.io.InputStream;

import com.insigma.mvc.model.SFileRecord;




/**
 * �ļ��ϴ�service
 * @author wengsh
 *
 */
public interface UploadService {
	 public SFileRecord getFileInfo(String file_uuid);  
     public byte[]  download(String file_path);  
     public String upload(String originalFilename,InputStream in);  
}
