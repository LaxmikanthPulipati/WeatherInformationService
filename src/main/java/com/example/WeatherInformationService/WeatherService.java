package com.example.WeatherInformationService;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String API_KEY = "9453c63499b737697e27d4e2d5158fde";
    private static final String BASE_URL = "http://api.weatherstack.com/current?access_key=" + API_KEY + "&query=";

    public String getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL + city;
        return restTemplate.getForObject(url, String.class);
    }
}


