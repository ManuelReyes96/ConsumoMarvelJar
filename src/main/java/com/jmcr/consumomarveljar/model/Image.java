package com.jmcr.consumomarveljar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class Image part of the json response of 
 * Marvel API
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
@NoArgsConstructor
public class Image {
	/**
	 * The directory path of to the image.
	 */
	@JsonProperty("path")
    public String path;
    
    /**
     * The file extension for the image.
     */
	@JsonProperty("extension")
    public String extension;
}
