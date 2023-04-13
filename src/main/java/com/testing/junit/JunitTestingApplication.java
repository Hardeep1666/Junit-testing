package com.testing.junit;

import java.lang.ProcessHandle.Info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JunitTestingApplication {

	Logger logger =LoggerFactory.getLogger(JunitTestingApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application started");
	}
	
	public static void main(String[] args) {
	
		SpringApplication.run(JunitTestingApplication.class, args);
	}

}
