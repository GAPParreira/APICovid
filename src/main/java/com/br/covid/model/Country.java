package com.br.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
	private Countries[] countries;

	public Countries[] getCountries() {
		return countries;
	}

	public void setCountries(Countries[] countries) {
		this.countries = countries;
	}
   
	
}