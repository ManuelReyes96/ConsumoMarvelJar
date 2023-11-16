package com.jmcr.consumomarveljar;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class ConsumomarveljarApplicationTests generate a basic test 
 * Using Junit 5
 */
@SpringBootTest
class ConsumomarveljarApplicationTests {

	/**
	 * Basic test for main method
	 */
	@Test
	void contextLoads() {
		assertDoesNotThrow(() -> ConsumoMarvelJarApplication.main(new String[] {}));
	}

}
