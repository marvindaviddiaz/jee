package com.sample.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/HomeServlet", "/HomeAnother" })
public class LoggingServletFilter implements Filter {

	public static final String SERVLET_FILTERED = "SERVLET_FILTERED";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("LogginServletFilter.init");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("LogginServletFilter.doFilter start");
		request.setAttribute(SERVLET_FILTERED, Boolean.TRUE);
		chain.doFilter(request, response);
		System.out.println("LogginServletFilter.doFilter stop");
	}

	@Override
	public void destroy() {
		System.out.println("LogginServletFilter.destroy");
	}

}
