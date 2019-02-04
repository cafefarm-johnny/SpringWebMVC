package com.johnny;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter init!!!");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter doFilter!!!");
		// chain을 통해 doFilter를 연결해주지 않으면 요청 응답이 다음 필터로 전달되지 않는다.
		chain.doFilter(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("Filter destory!!!");
	}
}
