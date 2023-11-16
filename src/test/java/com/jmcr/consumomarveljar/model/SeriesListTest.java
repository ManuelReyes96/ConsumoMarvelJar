package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test SeriesList Model
 */
@SpringBootTest
class SeriesListTest {

	/**
	 * Instance of Model
	 */
	private SeriesList seriesList;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		seriesList = new SeriesList();
		seriesList.setAvailable("0");
		seriesList.setCollectionURI("0");
		seriesList.setItems(new ArrayList<>());
		seriesList.setReturned("0");
		
		assertNotNull(seriesList.getAvailable());
		assertNotNull(seriesList.getCollectionURI());
		assertNotNull(seriesList.getItems());
		assertNotNull(seriesList.getReturned());
	}
}
