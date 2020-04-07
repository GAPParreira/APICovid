package com.br.covid.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.br.covid.model.Confirmados;
import com.br.covid.model.Countries;
import com.br.covid.model.CountriesCountries;
import com.br.covid.model.Country;
import com.br.covid.model.Daily;
import com.br.covid.model.DailyDate;
import com.br.covid.model.ResumoCovid;

@RestController
public class CovidController {

	RestTemplate restTemplate;

	public CovidController() {
		restTemplate = new RestTemplate();
	}

	@RequestMapping(value = "/covid/api", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResumoCovid getApi() {
		final ResumoCovid covid = restTemplate.getForObject("https://covid19.mathdro.id/api", ResumoCovid.class);
		return covid;
	}

	@RequestMapping(value = "/covid/api/confirmed", method = RequestMethod.GET, headers = "Accept=application/json")
	public Confirmados[] getConfirmed() {

		Confirmados[] covid = restTemplate.getForObject("https://covid19.mathdro.id/api/confirmed",
				Confirmados[].class);
		return covid;
	}

	@RequestMapping(value = "/covid/api/daily", method = RequestMethod.GET, headers = "Accept=application/json")
	public Daily[] getDaily() {

		Daily[] covid = restTemplate.getForObject("https://covid19.mathdro.id/api/daily", Daily[].class);
		return covid;
	}

	@RequestMapping(value = "/covid/api/daily/{date}", method = RequestMethod.GET, headers = "Accept=application/json")
	public DailyDate[] getDailyDate(@PathVariable String date) {

		DailyDate[] covid = restTemplate.getForObject("https://covid19.mathdro.id/api/daily/" + date,
				DailyDate[].class);
		return covid;
	}

	@RequestMapping(value = "/covid/api/countries", method = RequestMethod.GET, headers = "Accept=application/json")
	public Country getCountries() {

		Country covid = restTemplate.getForObject("https://covid19.mathdro.id/api/countries", Country.class);
		return covid;
	}

	@RequestMapping(value = "/covid/api/countries/{country}", method = RequestMethod.GET, headers = "Accept=application/json")
	public CountriesCountries getCountriesCountries(@PathVariable String country) {

		CountriesCountries covid = restTemplate.getForObject("https://covid19.mathdro.id/api/countries/"+ country,
				CountriesCountries.class);
		return covid;
	}
}
