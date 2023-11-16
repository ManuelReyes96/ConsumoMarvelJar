package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test CharacterDataContainer Model
 */
@SpringBootTest
class CharacterDataContainerTest {

	/**
	 * Instance of Model
	 */
	private CharacterDataContainer characterDataContainer;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		characterDataContainer = new CharacterDataContainer();
		characterDataContainer.setCount("0");
		characterDataContainer.setLimit("0");
		characterDataContainer.setOffset("0");
		characterDataContainer.setResults(new ArrayList<>());
		characterDataContainer.setTotal("0");
		
		assertNotNull(characterDataContainer.getCount());
		assertNotNull(characterDataContainer.getLimit());
		assertNotNull(characterDataContainer.getOffset());
		assertNotNull(characterDataContainer.getResults());
		assertNotNull(characterDataContainer.getTotal());
	}
}
