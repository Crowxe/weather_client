package com.crow.clima.service;

import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.crow.clima.dtos.TopCitiesDTO;
import com.crow.clima.entity.TopCitiesEntity;
import com.crow.clima.repository.TopCitiesRepository;

@Service
public class WeatherService {

	@Autowired
	TopCitiesRepository repository;

	public WeatherService() {
	}

	public List<TopCitiesDTO> getAll() {

		RestTemplate rest = new RestTemplate();

		ResponseEntity<List<TopCitiesDTO>> rateResponse = rest.exchange("http://localhost:8080/topCities/seeAll",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<TopCitiesDTO>>() {
				});

		List<TopCitiesDTO> allCities = rateResponse.getBody();

		return allCities;

	}

	public List<TopCitiesDTO> getAllUpdated(String group) {

		RestTemplate rest = new RestTemplate();

		ResponseEntity<List<TopCitiesDTO>> rateResponse = rest.exchange("http://localhost:8080/topCities/seeAllUpdated/"+group,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<TopCitiesDTO>>() {

				});
		
		List<TopCitiesDTO> allCitiesUpdated = rateResponse.getBody();
		
		return allCitiesUpdated;

	}

}
