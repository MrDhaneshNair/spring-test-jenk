package com.learn.jenk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenk")
public class HomeController {

	@Value("${server.port}")
	private String portNumber;
	
	@Value("${spring.application.name}")
	private String appName;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
			
	@GetMapping("/hello")
	public String getHello() {
		LOGGER.info("getHello method.....");
		return "Success !! " + portNumber + " " + appName;
	}
}
