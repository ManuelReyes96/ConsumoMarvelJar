package com.jmcr.consumomarveljar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class Url part of the json response from 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class Url {
	/**
	 * A text identifier for the URL.
	 */
	@JsonProperty("type")
    public String type;

	/**
	 * A full URL (including scheme, domain, and path).
	 */
	@JsonProperty("url")
    public String fullUrl;
}
