package com.dchang.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfiguration {
	
	private static final Logger log = LoggerFactory.getLogger(DevConfiguration.class);
	/*
	 * Don't seem to find many good use cases. to do Profile() that way
	 * probably simple way is to just set to use different profiles yml
	@Bean
	public CachManager cacheManager() {
		return new SomeCacheManager();
	}
	*
	*/
	
	public DevConfiguration() {
		log.info("DevConfiguration Loading");
		log.info("environment: " + environment + " is null here. yml not load yet");
	}
	
	@Value("${environment}")
	private String environment;
	
	
}
