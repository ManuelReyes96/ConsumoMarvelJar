package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test Image Model
 */
@SpringBootTest
class ImageTest {

	/**
	 * Instance of Model
	 */
	private Image image;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		image = new Image();
		image.setExtension("0");
		image.setPath("0");
		
		assertNotNull(image.getExtension());
		assertNotNull(image.getPath());
	}
}
