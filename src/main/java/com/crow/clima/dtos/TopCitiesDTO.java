package com.crow.clima.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TopCitiesDTO {

	private String localizedName;
	private String weatherText;
	private double temperatureValue;
	private String temperatureUnit;

	@JsonCreator
	public TopCitiesDTO(@JsonProperty("localizedName") String LocalizedName,
			@JsonProperty("weatherText") String WeatherText, @JsonProperty("temperatureValue") double temperatureValue, @JsonProperty("temperatureUnit") String temperatureUnit) {
		this.localizedName = LocalizedName;
		this.weatherText = WeatherText;
		this.temperatureValue = temperatureValue;
		this.temperatureUnit = temperatureUnit;
	}

	public String getLocalizedName() {
		return localizedName;
	}

	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}

	public String getWeatherText() {
		return weatherText;
	}

	public void setWeatherText(String weatherText) {
		this.weatherText = weatherText;
	}

	public double getTemperatureValue() {
		return temperatureValue;
	}

	public void setTemperatureValue(double temperatureValue) {
		this.temperatureValue = temperatureValue;
	}

	public TopCitiesDTO() {
	}

	public String getTemperatureUnit() {
		return temperatureUnit;
	}

	public void setTemperatureUnit(String temperatureUnit) {
		this.temperatureUnit = temperatureUnit;
	}
}
