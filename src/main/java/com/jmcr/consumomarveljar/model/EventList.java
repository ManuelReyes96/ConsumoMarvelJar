package com.jmcr.consumomarveljar.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class EventList part of the json response of 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class EventList {
	/**
	 * The number of total available events in this list. Will always be greater than or equal to the "returned" value.
	 */
	@JsonProperty("available")
    public String available;
	
	/**
	 * The number of events returned in this collection (up to 20).
	 */
	@JsonProperty("returned")
    public String returned;
	
	/**
	 * The path to the full list of events in this collection.
	 */
	@JsonProperty("collectionURI")
    public String collectionURI;
	
	/**
	 * The list of returned events in this collection.
	 */
	@JsonProperty("items")
    public ArrayList<EventsSummary> items;
}
