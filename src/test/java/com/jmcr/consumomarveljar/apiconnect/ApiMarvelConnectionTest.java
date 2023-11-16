package com.jmcr.consumomarveljar.apiconnect;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.jmcr.consumomarveljar.apiconnect.data.VariableConfig;
import com.jmcr.consumomarveljar.model.CharacterDataWrapper;

/**
 * Test class for ApiMarvelConnection 
 * Using Junit 5
 */
@SpringBootTest
class ApiMarvelConnectionTest {

	/**
	 * Injection of ApiMarvelConnection
	 */
	@InjectMocks
	private ApiMarvelConnection apiMarvel;

	/**
	 * Mocking restTemplate of ApiMarvelConnection
	 */
	@Mock
	private RestTemplate restTemplate;

	/**
	 * Mocking VariableConfig of ApiMarvelConnection
	 */
	@Mock
	private VariableConfig config;

	/**
	 * Method to test GetCharacters from ApiMarvelConnection
	 */
	@Test
	void testGetCharacters() {
		ResponseEntity<CharacterDataWrapper> info = new ResponseEntity<CharacterDataWrapper>(new CharacterDataWrapper(),
				HttpStatus.OK);
		when(restTemplate.getForEntity(anyString(), eq(CharacterDataWrapper.class))).thenReturn(info);
		assertDoesNotThrow(() -> apiMarvel.getCharacters(1, 1));
	}

	/**
	 * Method to test GetCharactersById from ApiMarvelConnection
	 */
	@Test
	void testGetCharactersByID() {
		ResponseEntity<CharacterDataWrapper> info = new ResponseEntity<CharacterDataWrapper>(new CharacterDataWrapper(),
				HttpStatus.OK);
		when(restTemplate.getForEntity(anyString(), eq(CharacterDataWrapper.class))).thenReturn(info);
		assertDoesNotThrow(() -> apiMarvel.getCharacterById(1));
	}
}
