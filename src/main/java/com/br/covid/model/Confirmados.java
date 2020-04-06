package com.br.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Confirmados {
	private String provinceState;
	private String countryRegion;
	private Long lastUpdate;
	private Double lat;
	private Double longe;
	private Long confirmed;
	private Long recovered;
	private Long death;
	private Long active;
	private String admin2;
	private String fips;
	private String combinedKey;
	private String incidendRate;
	private String peopleTested;
	private String iso2;
	private String iso3;
	
	
	public Confirmados() {
	}


	public String getProvinceState() {
		return provinceState;
	}


	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}


	public String getCountryRegion() {
		return countryRegion;
	}


	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}


	public Long getLastUpdate() {
		return lastUpdate;
	}


	public void setLastUpdate(Long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}


	public Double getLat() {
		return lat;
	}


	public void setLat(Double lat) {
		this.lat = lat;
	}


	public Double getLonge() {
		return longe;
	}


	public void setLonge(Double longe) {
		this.longe = longe;
	}


	public Long getConfirmed() {
		return confirmed;
	}


	public void setConfirmed(Long confirmed) {
		this.confirmed = confirmed;
	}


	public Long getRecovered() {
		return recovered;
	}


	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}


	public Long getDeath() {
		return death;
	}


	public void setDeath(Long death) {
		this.death = death;
	}


	public Long getActive() {
		return active;
	}


	public void setActive(Long active) {
		this.active = active;
	}


	public String getAdmin2() {
		return admin2;
	}


	public void setAdmin2(String admin2) {
		this.admin2 = admin2;
	}


	public String getFips() {
		return fips;
	}


	public void setFips(String fips) {
		this.fips = fips;
	}


	public String getCombinedKey() {
		return combinedKey;
	}


	public void setCombinedKey(String combinedKey) {
		this.combinedKey = combinedKey;
	}


	public String getIncidendRate() {
		return incidendRate;
	}


	public void setIncidendRate(String incidendRate) {
		this.incidendRate = incidendRate;
	}


	public String getPeopleTested() {
		return peopleTested;
	}


	public void setPeopleTested(String peopleTested) {
		this.peopleTested = peopleTested;
	}


	public String getIso2() {
		return iso2;
	}


	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}


	public String getIso3() {
		return iso3;
	}


	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}
	
	
	
}
