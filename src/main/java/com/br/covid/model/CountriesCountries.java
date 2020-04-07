package com.br.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountriesCountries {
    private Confirmed confirmed;
    private Recovered recovered;
    private Deaths deaths;
    private String lastUpdate;

    public CountriesCountries() {
    }

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

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
}