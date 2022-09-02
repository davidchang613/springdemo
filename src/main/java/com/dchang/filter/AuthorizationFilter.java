package com.dchang.filter;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

// https://www.baeldung.com/spring-boot-add-filter
//https://www.tutorialspoint.com/spring_boot/spring_boot_servlet_filter.htm
@Component
public class AuthorizationFilter implements Filter {
	
	private final static Logger log = LoggerFactory.getLogger(AuthorizationFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)  
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
	
		Optional<String> authString = Optional.ofNullable(req.getHeader("Authorization"));
		if (authString.isPresent()) {
			String token = authString.get();
			log.info("Authorization Token exists: " + token);
			// validate token
		}
		log.info("auth:" + authString);
		chain.doFilter(request, response);
	}
}
