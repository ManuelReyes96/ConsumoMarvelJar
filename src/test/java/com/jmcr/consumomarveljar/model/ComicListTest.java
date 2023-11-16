package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test ComicList Model
 */
@SpringBootTest
class ComicListTest {

	/**
	 * Instance of Model
	 */
	private ComicList comicList;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		comicList = new ComicList();
		comicList.setAvailable("0");
		comicList.setCollectionURI("0");
		comicList.setItems(new ArrayList<>());
		comicList.setReturned("0");
		
		assertNotNull(comicList.getAvailable());
		assertNotNull(comicList.getCollectionURI());
		assertNotNull(comicList.getItems());
		assertNotNull(comicList.getReturned());
	}
}
