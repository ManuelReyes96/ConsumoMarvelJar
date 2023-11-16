package com.jmcr.consumomarveljar.apiconnect.data;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;

/**
 * Class VariableConnection for get variables from application properties
 * Notation Getter generate the getters of the objects in the class 
 * Notation Setter generate the setters of the objects in the class 
 * Notation NoArgsConstructor generate an empty constructor without arguments
 */
@Getter
@Setter
public class VariableConfig {

	/**
	 * Get the variable urlCharacters
	 */
	@Value("${data.connection.urlCharacters}")
	private String urlCharacters;
	
	/**
	 * Get the variable ts
	 */
	@Value("${data.connection.ts}")
	private String ts;
	
	/**
	 * Get the variable apiKey
	 */
	@Value("${data.connection.apiKey}")
	private String apiKey;
	
	/**
	 * Get the variable hash
	 */
	@Value("${data.connection.hash}")
	private String hash;
}
