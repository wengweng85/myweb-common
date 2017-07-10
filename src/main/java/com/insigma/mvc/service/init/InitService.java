package com.insigma.mvc.service.init;

import java.util.List;

import com.insigma.mvc.model.CodeType;
import com.insigma.mvc.model.CodeValue;


/**
 * Ö÷Ò³service
 * @author wengsh
 *
 */
public interface InitService {
	
	public List<CodeType> getInitcodetypeList();
	public List<CodeValue> getInitCodeValueList(String code_type);
	
}
