package com.insigma.common.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * ��վ��ȫ������
 * 1.�Ƿ��¼����
 * 2 csrf referer ����
 * 3 xss��sqlע�����
 *
 */
public class SafeFilter implements javax.servlet.Filter {

    Log log= LogFactory.getLog(SafeFilter.class);


    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

	@Override
	@SuppressWarnings("unused")
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        /**
         * xss��sqlע�����
         **/
        SafeFilterHttpServletRequestWrapper safeRequest = new SafeFilterHttpServletRequestWrapper(request);
        filterChain.doFilter(safeRequest, servletResponse);
        
    }

}
