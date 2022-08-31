package com.dchang.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
//different properties for different profile
@PropertySource("classpath:/static/profiles/application-${spring.profiles.active}.properties")

@ComponentScan(basePackages = { "com.dchang.*" })

//https://spring.io/guides/gs/scheduling-tasks/
@EnableScheduling

public class DemoApplication {

	private final static Logger log = LoggerFactory.getLogger(DemoApplication.class); 
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	//@Scheduled(fixedRate = 1000)
	@Scheduled(fixedDelay= 1000)
	public void doScheduledTask() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		log.info("Ths time is now {}", dateFormat.format(new Date()));
	}
	
	

}
