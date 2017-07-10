package com.insigma.mvc.service.solr;

import com.github.pagehelper.PageInfo;

/**
 * solr·þÎñ
 * @author wengsh
 *
 */
public interface SolrService {
	public PageInfo search_cms_info(String q,int start,int rows);
}
