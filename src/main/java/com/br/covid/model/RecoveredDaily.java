package com.br.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RecoveredDaily {
    private Long total;
    private Long china;
    private Long outsideChina;

    public RecoveredDaily() {
    } 

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getChina() {
        return china;
    }

    public void setChina(Long china) {
        this.china = china;
    }

    public Long getOutsideChina() {
        return outsideChina;
    }

    public void setOutsideChina(Long outsideChina) {
        this.outsideChina = outsideChina;
    }    
}