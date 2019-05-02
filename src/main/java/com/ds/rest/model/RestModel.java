package com.ds.rest.model;

import org.springframework.stereotype.Component;

@Component
public class RestModel {
	private String city;
	private String population;
	private String rating;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
}
