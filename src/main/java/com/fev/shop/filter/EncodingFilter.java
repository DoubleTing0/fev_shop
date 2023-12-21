package com.fev.shop.filter;

import java.io.IOException;

import com.fev.shop.util.TeamColor;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebFilter("/*")
public class EncodingFilter extends HttpFilter implements Filter {
    @Override 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		log.debug(TeamColor.BLUE + "EndoingFilter 실행");
		
		request.setCharacterEncoding("utf-8");
		
		chain.doFilter(request, response);
	}
	
}
