package com.jmcr.consumomarveljar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class EventsSummary part of the json response of 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class EventsSummary {
	/**
	 * The path to the individual story resource.
	 */
	@JsonProperty("resourceURI")
    public String resourceURI;
	
	/**
	 * The canonical name of the story.
	 */
	@JsonProperty("name")
    public String name;
	
	/**
	 * The type of the story (interior or cover).
	 */
	@JsonProperty("type")
    public String type;
}
