package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test StorySummary Model
 */
@SpringBootTest
class UrlTest {

	/**
	 * Instance of Model
	 */
	private Url url;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		url = new Url();
		url.setType("0");
		url.setFullUrl("0");
		
		assertNotNull(url.getType());
		assertNotNull(url.getFullUrl());
	}
}
