package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test StoryList Model
 */
@SpringBootTest
class StoryListTest {

	/**
	 * Instance of Model
	 */
	private StoryList storyList;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		storyList = new StoryList();
		storyList.setAvailable("0");
		storyList.setCollectionURI("0");
		storyList.setItems(new ArrayList<>());
		storyList.setReturned("0");
		
		assertNotNull(storyList.getAvailable());
		assertNotNull(storyList.getCollectionURI());
		assertNotNull(storyList.getItems());
		assertNotNull(storyList.getReturned());
	}
}
