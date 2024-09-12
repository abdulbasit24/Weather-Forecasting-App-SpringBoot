package com.example.weatherapp.controller;

import com.example.weatherapp.service.WeatherService;
import com.example.weatherapp.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class WeatherController {

    private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam(required = false) String city, Model model) {
        if (city == null || city.isEmpty()) {
            model.addAttribute("error", "Please enter a city name to get the weather.");
            return "weather";
        }

        try {
            WeatherResponse weather = weatherService.getWeatherByCity(city);

            // Log the response to check what's coming from the API
            logger.info("Weather API response: {}", weather);

            // Check if the API returned an error code (like "404" for city not found)
            if (weather.getCod() != null && weather.getCod().equals("404")) {
                model.addAttribute("error", "City not found.");
                return "weather";
            }

            model.addAttribute("weather", weather);
            return "weather";
        } catch (Exception e) {
            model.addAttribute("error", "Service unavailable or an unexpected error occurred.");
            logger.error("Error while fetching weather: ", e);
            return "weather";
        }
    }
}
