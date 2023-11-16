package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test SeriesSummary Model
 */
@SpringBootTest
class SeriesSummaryTest {

	/**
	 * Instance of Model
	 */
	private SeriesSummary seriesSummary;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		seriesSummary = new SeriesSummary();
		seriesSummary.setName("0");
		seriesSummary.setResourceURI("0");
		
		assertNotNull(seriesSummary.getName());
		assertNotNull(seriesSummary.getResourceURI());
	}
}
