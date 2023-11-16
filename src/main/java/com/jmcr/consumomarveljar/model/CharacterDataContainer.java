package com.jmcr.consumomarveljar.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class CharacterDataContainer part of the json response from 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class CharacterDataContainer {
	/**
	 * The requested offset (number of skipped results) of the call
	 */
	@JsonProperty("offset")
	public String offset;

	/**
	 * The requested result limit.
	 */
	@JsonProperty("limit")
	public String limit;

	/**
	 * The total number of resources available given the current filter set.
	 */
	@JsonProperty("total")
	public String total;

	/**
	 * The total number of results returned by this call.
	 */
	@JsonProperty("count")
	public String count;

	/**
	 * The list of characters returned by the call.
	 */
	@JsonProperty("results")
	public ArrayList<Character> results;
}
