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
	private RestTemplate restTemplate;

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
		finalURL.append(variableConfig.getUrlCharacters());
		if (heroCode > 0) {
			finalURL.append("/" + heroCode);
		}
		finalURL.append("?ts=" + variableConfig.getTs());
		finalURL.append("&apikey=" + variableConfig.getApiKey());
		finalURL.append("&hash=" + variableConfig.getHash());
		if (limit > 0) {
			finalURL.append("&limit=" + limit);
		}
		if (offset > 0) {
			finalURL.append("&offset=" + offset);
		}
		return finalURL.toString();
	}
}
