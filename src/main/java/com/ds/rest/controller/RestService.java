package com.ds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.rest.model.RestModel;

@RestController
public class RestService {

	@Autowired
	RestModel restModel;

	@GetMapping("/getcityinfo")

	public RestModel getRandomCityJson() {
		restModel.setCity("bengaluru");
		restModel.setPopulation("1909090");
		restModel.setRating("5");
		return restModel;
	}
}
