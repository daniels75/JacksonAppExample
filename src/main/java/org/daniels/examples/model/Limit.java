package org.daniels.examples.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Limit {

	@JsonProperty
	private int id;
	@JsonProperty
	private double value;
}
