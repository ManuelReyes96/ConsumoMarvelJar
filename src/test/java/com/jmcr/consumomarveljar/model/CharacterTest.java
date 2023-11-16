package com.jmcr.consumomarveljar.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class to test Character Model
 */
@SpringBootTest
class CharacterTest {

	/**
	 * Instance of Model
	 */
	private Character character;

	/**
	 * Method to test the Model
	 */
	@Test
	void testModel() {
		character = new Character();
		character.setId("0");
		character.setName("0");
		character.setDescription("0");
		character.setModified("0");
		character.setResourceURI("0");
		character.setUrls(new ArrayList<>());
		character.setThumbnail(new Image());
		character.setComics(new ComicList());
		character.setStories(new StoryList());
		character.setEvents(new EventList());
		character.setSeries(new SeriesList());
		
		assertNotNull(character.getId());
		assertNotNull(character.getName());
		assertNotNull(character.getDescription());
		assertNotNull(character.getModified());
		assertNotNull(character.getResourceURI());
		assertNotNull(character.getUrls());
		assertNotNull(character.getThumbnail());
		assertNotNull(character.getComics());
		assertNotNull(character.getStories());
		assertNotNull(character.getEvents());
		assertNotNull(character.getSeries());
	}
}
