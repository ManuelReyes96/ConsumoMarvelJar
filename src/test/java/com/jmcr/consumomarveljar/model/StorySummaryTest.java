package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test StorySummary Model
 */
@SpringBootTest
class StorySummaryTest {

	/**
	 * Instance of Model
	 */
	private StorySummary storySummary;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		storySummary = new StorySummary();
		storySummary.setName("0");
		storySummary.setResourceURI("0");
		storySummary.setType("0");
		
		assertNotNull(storySummary.getName());
		assertNotNull(storySummary.getResourceURI());
		assertNotNull(storySummary.getType());
	}
}
