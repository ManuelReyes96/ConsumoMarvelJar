package com.jmcr.consumomarveljar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class ComicSummary part of the json response of 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class SeriesSummary {
	/**
	 * The path to the individual comic resource.
	 */
	@JsonProperty("resourceURI")
    public String resourceURI;
	
	/**
	 * The canonical name of the comic
	 */
	@JsonProperty("name")
    public String name;
}
