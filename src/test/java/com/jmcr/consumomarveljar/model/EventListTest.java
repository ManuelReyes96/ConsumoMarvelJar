package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test EventList Model
 */
@SpringBootTest
class EventListTest {

	/**
	 * Instance of Model
	 */
	private EventList eventList;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		eventList = new EventList();
		eventList.setAvailable("0");
		eventList.setCollectionURI("0");
		eventList.setItems(new ArrayList<>());
		eventList.setReturned("0");
		
		assertNotNull(eventList.getAvailable());
		assertNotNull(eventList.getCollectionURI());
		assertNotNull(eventList.getItems());
		assertNotNull(eventList.getReturned());
	}
}
