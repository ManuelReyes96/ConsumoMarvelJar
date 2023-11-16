package com.jmcr.consumomarveljar.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class ComicList part of the json response of 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class ComicList {
	/**
	 * The number of total available issues in this list. Will always be greater than or equal to the "returned" value.
	 */
	@JsonProperty("available")
    public String available;
	
	/**
	 * The number of issues returned in this collection (up to 20).
	 */
	@JsonProperty("returned")
    public String returned;
	
	/**
	 * The path to the full list of issues in this collection.
	 */
	@JsonProperty("collectionURI")
    public String collectionURI;
	
	/**
	 * The list of returned issues in this collection.
	 */
	@JsonProperty("items")
    public List<ComicSummary> items;
}
