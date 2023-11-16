package com.jmcr.consumomarveljar.apiconnect.data;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test VariableConfig Model
 */
@SpringBootTest
class VariableConfigTest {

	/**
	 * Instance of Model
	 */
	private VariableConfig config;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		config = new VariableConfig();
		config.setApiKey("0");
		config.setHash("0");
		config.setTs("0");
		config.setUrlCharacters("0");

		assertNotNull(config.getApiKey());
		assertNotNull(config.getHash());
		assertNotNull(config.getTs());
		assertNotNull(config.getUrlCharacters());
	}
}
