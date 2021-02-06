package com.learn.jenk;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringTestJenkinsApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringTestJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("Test running");
		assertTrue(true);
	}

}
