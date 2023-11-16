package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test EventsSummary Model
 */
@SpringBootTest
class EventSummaryTest {

	/**
	 * Instance of Model
	 */
	private EventsSummary eventSummary;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		eventSummary = new EventsSummary();
		eventSummary.setName("0");
		eventSummary.setResourceURI("0");
		eventSummary.setType("0");
		
		assertNotNull(eventSummary.getName());
		assertNotNull(eventSummary.getResourceURI());
		assertNotNull(eventSummary.getType());
	}
}
