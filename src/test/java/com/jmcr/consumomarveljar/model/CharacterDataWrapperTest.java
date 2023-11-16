package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test CharacterDataWrapper Model
 */
@SpringBootTest
class CharacterDataWrapperTest {

	/**
	 * Instance of Model
	 */
	private CharacterDataWrapper characterDataWrapper;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		characterDataWrapper = new CharacterDataWrapper();
		characterDataWrapper.setCode("200");
		characterDataWrapper.setStatus("Ok");
		characterDataWrapper.setCopyright("© 2023 MARVEL");
		characterDataWrapper.setAttributionText("Data provided by Marvel. © 2023 MARVEL");
		characterDataWrapper.setAttributionHTML("<a href=\"http://marvel.com\">Data provided by Marvel. © 2023 MARVEL</a>");
		characterDataWrapper.setEtag("e6fcf8ec1fd56fd73e4ff2d62d656718a49d719a");
		characterDataWrapper.setData(new CharacterDataContainer());
		
		assertNotNull(characterDataWrapper.getCode());
		assertNotNull(characterDataWrapper.getStatus());
		assertNotNull(characterDataWrapper.getCopyright());
		assertNotNull(characterDataWrapper.getAttributionText());
		assertNotNull(characterDataWrapper.getAttributionHTML());
		assertNotNull(characterDataWrapper.getEtag());
		assertNotNull(characterDataWrapper.getData());
	}
}
