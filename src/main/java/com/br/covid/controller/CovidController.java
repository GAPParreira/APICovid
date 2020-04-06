package com.br.covid.controller;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.br.covid.model.Confirmados;
import com.br.covid.model.Countries;
import com.br.covid.model.ResumoCovid;

@RestController
public class CovidController {
	
	RestTemplate restTemplate;
	
	public CovidController() {
		restTemplate = new RestTemplate();
	}
	
	@RequestMapping(value="/covid/api", method=RequestMethod.GET, headers="Accept=application/json")
	public ResumoCovid getApi() {
		final ResumoCovid covid = restTemplate.getForObject("https://covid19.mathdro.id/api", ResumoCovid.class);
		return covid;
	}
	
	@RequestMapping(value="/covid/api/confirmed", method=RequestMethod.GET, headers="Accept=application/json")
	public Confirmados[] getConfirmed() {
		 		 
		 Confirmados[] covid = restTemplate.getForObject("https://covid19.mathdro.id/api/confirmed", Confirmados[].class);
		return covid;
	}
	
	@RequestMapping(value="/covid/api/daily", method=RequestMethod.GET, headers="Accept=application/json")
	public Confirmados[] getDaily() {
		 		 
		 Confirmados[] covid = restTemplate.getForObject("https://covid19.mathdro.id/api/confirmed", Confirmados[].class);
		return covid;
	}
	
	@RequestMapping(value="/covid/api/daily/{date}", method=RequestMethod.GET, headers="Accept=application/json")
	public Confirmados[] getDailyDate(@PathVariable String date) {
		 		 
		 Confirmados[] covid = restTemplate.getForObject("https://covid19.mathdro.id/api/daily/"+date, Confirmados[].class);
		return covid;
	}
	
	@RequestMapping(value="/covid/api/countries", method=RequestMethod.GET, headers="Accept=application/json")
	public Countries getCountries() {
		 		 
		 Countries covid = restTemplate.getForObject("https://covid19.mathdro.id/api/countries", Countries.class);
		return covid;
	}
}
