package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test ComicSummary Model
 */
@SpringBootTest
class ComicSummaryTest {

	/**
	 * Instance of Model
	 */
	private ComicSummary comicSummary;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		comicSummary = new ComicSummary();
		comicSummary.setName("0");
		comicSummary.setResourceURI("0");
		
		assertNotNull(comicSummary.getName());
		assertNotNull(comicSummary.getResourceURI());
	}
}
