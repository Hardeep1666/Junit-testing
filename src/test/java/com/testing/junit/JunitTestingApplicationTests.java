package com.testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitTestingApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(JunitTestingApplicationTests.class);
	
	@Test
	void contextLoads() {
		
		logger.info("test case Excecuted");
		assertEquals(true, true);
	}

}
