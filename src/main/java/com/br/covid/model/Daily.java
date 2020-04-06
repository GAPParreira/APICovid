package com.br.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {
	private Long totalConfirmed;
    private Long mainlandChina;
    private Long otherLocations;
    private Long deltaConfirmed;
    private Long totalRecovered;
    
}
