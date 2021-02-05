package com.learn.jenk.controller;

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
	
	@GetMapping("/hello")
	public String getHello() {
		return "Success !! " + portNumber + " " + appName;
	}
}
