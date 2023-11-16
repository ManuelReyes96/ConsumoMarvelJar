package com.jmcr.consumomarveljar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class CharacterDataWrapper, initial part of the json received from 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class Notation
 * Setter generate the setters of the objects in the class Notation
 * NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class CharacterDataWrapper {
	/**
	 * The HTTP status code of the returned result.
	 */
	@JsonProperty("code")
	public String code;

	/**
	 * A string description of the call status.
	 */
	@JsonProperty("status")
	public String status;

	/**
	 * The copyright notice for the returned result.
	 */
	@JsonProperty("copyright")
	public String copyright;

	/**
	 * The attribution notice for this result. Please display either this notice or
	 * the contents of the attributionHTML field on all screens which contain data
	 * from the Marvel Comics API.
	 */
	@JsonProperty("attributionText")
	public String attributionText;

	/**
	 * An HTML representation of the attribution notice for this result. Please
	 * display either this notice or the contents of the attributionText field on
	 * all screens which contain data from the Marvel Comics API.
	 */
	@JsonProperty("attributionHTML")
	public String attributionHTML;

	/**
	 * The results returned by the call.
	 */
	@JsonProperty("data")
	public CharacterDataContainer data;

	/**
	 * A digest value of the content returned by the call
	 */
	@JsonProperty("etag")
	public String etag;
}
