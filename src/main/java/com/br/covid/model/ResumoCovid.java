package com.br.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ResumoCovid {

	Confirmed confirmed;
	Recovered recovered;
	Deaths deaths;
	public Confirmed getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Confirmed confirmed) {
		this.confirmed = confirmed;
	}
	public Recovered getRecovered() {
		return recovered;
	}
	public void setRecovered(Recovered recovered) {
		this.recovered = recovered;
	}
	public Deaths getDeaths() {
		return deaths;
	}
	public void setDeaths(Deaths deaths) {
		this.deaths = deaths;
	}
	
}