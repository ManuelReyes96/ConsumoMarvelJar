package com.jmcr.consumomarveljar.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class Character part of the json response of 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class Character {
	/**
	 * The unique ID of the character resource.
	 */
	@JsonProperty("id")
	public String id;
	
	/**
	 * The name of the character.
	 */
	@JsonProperty("name")
	public String name;
	
	/**
	 * A short bio or description of the character.
	 */
	@JsonProperty("description")
	public String description;
	
	/**
	 * The date the resource was most recently modified.
	 */
	@JsonProperty("modified")
	public String modified;
	
	/**
	 * The canonical URL identifier for this resource.
	 */
	@JsonProperty("resourceURI")
	public String resourceURI;
	
	/**
	 * A set of public web site URLs for the resource.
	 */
	@JsonProperty("urls")
	public List<Url> urls;
	
	/**
	 * The representative image for this character.
	 */
	@JsonProperty("thumbnail")
	public Image thumbnail;
	
	/**
	 * A resource list containing comics which feature this character.
	 */
	@JsonProperty("comics")
	public ComicList comics;
	
	/**
	 * A resource list of stories in which this character appears.
	 */
	@JsonProperty("stories")
	public StoryList stories;
	
	/**
	 * A resource list of events in which this character appears.
	 */
	@JsonProperty("events")
	public EventList events;

	/**
	 * A resource list of series in which this character appears.
	 */
	@JsonProperty("series")
	public SeriesList series;
}
