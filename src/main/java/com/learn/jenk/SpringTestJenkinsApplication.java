package com.learn.jenk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestJenkinsApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringTestJenkinsApplication.class);
	public static void main(String[] args) {
		LOGGER.debug("SpringTestJenkinsApplication Application started....");
		SpringApplication.run(SpringTestJenkinsApplication.class, args);
	}

}
