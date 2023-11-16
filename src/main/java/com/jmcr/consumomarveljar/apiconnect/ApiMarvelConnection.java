package com.jmcr.consumomarveljar.apiconnect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.jmcr.consumomarveljar.apiconnect.data.VariableConfig;
import com.jmcr.consumomarveljar.model.CharacterDataWrapper;

/**
 * Class ApiMarvelConnection for connect to API Marvel
 */
public class ApiMarvelConnection {

	/**
	 * instance of RestTemplate to connect to API Marvel
	 */
	@Autowired
	private RestTemplate restTemplate = new RestTemplate();

	/**
	 * Instance of Variable Connection
	 */
	@Autowired
	private VariableConfig variableConfig;

	/**
	 * Method getCharacters to get the list of characters
	 * @param limit set the size of list of characters
	 * @param offset skip an specific number of characters
	 * @return a character list
	 */
	public CharacterDataWrapper getCharacters(int limit, int offset) {
		ResponseEntity<CharacterDataWrapper> response = restTemplate.getForEntity(generateURL(0, limit, offset),
				CharacterDataWrapper.class);
		return response.getBody();
	}

	/**
	 * Method getCharacterById to get an specific character
	 * @param heroCode character id
	 * @return a character
	 */
	public CharacterDataWrapper getCharacterById(int heroCode) {
		ResponseEntity<CharacterDataWrapper> response = restTemplate.getForEntity(generateURL(heroCode, 0, 0),
				CharacterDataWrapper.class);
		return response.getBody();
	}

	/**
	 * Method generateURL generate the url to consult
	 * @param heroCode character id
	 * @param limit set the size of list of characters
	 * @param offset skip an specific number of characters
	 * @return url created
	 */
	private String generateURL(int heroCode, int limit, int offset) {
		var finalURL = new StringBuilder();
		finalURL.append("https://gateway.marvel.com:443/v1/public/characters");
		if (heroCode > 0) {
			finalURL.append("/" + heroCode);
		}
		finalURL.append("?ts=" + "1");
		finalURL.append("&apikey=" + "312bc8c97d76ebd8b8dff605ea3381bf");
		finalURL.append("&hash=" + "948d7e7f59fd4e1afaa31c0045910bdd");
		if (limit > 0) {
			finalURL.append("&limit=" + limit);
		}
		if (offset > 0) {
			finalURL.append("&offset=" + offset);
		}
		return finalURL.toString();
	}
}
