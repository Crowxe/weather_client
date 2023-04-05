package com.crow.clima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crow.clima.dtos.TopCitiesDTO;
import com.crow.clima.service.WeatherService;

@Controller
public class WeatherController {

	@Autowired
	WeatherService service;

	@GetMapping("/getAll")
	public String getAll(Model model) {

		List<TopCitiesDTO> cities = service.getAll();
		model.addAttribute("cities", cities);
		return "index";

	}

	@GetMapping("/getAllUpdated/{numCities}")
	public String getAllUpdated(@PathVariable("numCities") String numCities, Model model) {
		List<TopCitiesDTO> citiesUpdated = service.getAllUpdated(numCities);
		model.addAttribute("citiesUpdated", citiesUpdated);
		return "updated";
	}

}
