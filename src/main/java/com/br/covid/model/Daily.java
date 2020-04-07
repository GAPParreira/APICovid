package com.br.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {
	private Long totalConfirmed;
    private Long mainlandChina;
    private Long otherLocations;
    private Long deltaConfirmed;
    private Long totalRecovered;
    private ConfirmedDaily confirmed;
    private DeltaConfirmedDetail deltaConfirmedDetail;
    private DeathsDaily deathsDaily;
    private RecoveredDaily recoveredDaily;
    private ActiveDaily activeDaily;

    public Daily() {
    }

    public Long getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(Long totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public Long getMainlandChina() {
        return mainlandChina;
    }

    public void setMainlandChina(Long mainlandChina) {
        this.mainlandChina = mainlandChina;
    }

    public Long getOtherLocations() {
        return otherLocations;
    }

    public void setOtherLocations(Long otherLocations) {
        this.otherLocations = otherLocations;
    }

    public Long getDeltaConfirmed() {
        return deltaConfirmed;
    }

    public void setDeltaConfirmed(Long deltaConfirmed) {
        this.deltaConfirmed = deltaConfirmed;
    }

    public Long getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Long totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public ConfirmedDaily getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(ConfirmedDaily confirmed) {
        this.confirmed = confirmed;
    }

    public DeltaConfirmedDetail getDeltaConfirmedDetail() {
        return deltaConfirmedDetail;
    }

    public void setDeltaConfirmedDetail(DeltaConfirmedDetail deltaConfirmedDetail) {
        this.deltaConfirmedDetail = deltaConfirmedDetail;
    }

    public DeathsDaily getDeathsDaily() {
        return deathsDaily;
    }

    public void setDeathsDaily(DeathsDaily deathsDaily) {
        this.deathsDaily = deathsDaily;
    }

    public RecoveredDaily getRecoveredDaily() {
        return recoveredDaily;
    }

    public void setRecoveredDaily(RecoveredDaily recoveredDaily) {
        this.recoveredDaily = recoveredDaily;
    }

    public ActiveDaily getActiveDaily() {
        return activeDaily;
    }

    public void setActiveDaily(ActiveDaily activeDaily) {
        this.activeDaily = activeDaily;
    }    
}
