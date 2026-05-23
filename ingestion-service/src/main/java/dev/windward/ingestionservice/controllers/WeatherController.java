package dev.windward.ingestionservice.controllers;

//port dev.windward.ingestionservice.Entities.WeatherObservation;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.net.URI;


@RestController
@RequestMapping("/api/weather")
public class WeatherController {


    private final RestClient restClient = RestClient.create("https://api.open-meteo.com");
    //WeatherObservation obs = new WeatherObservation();


    @GetMapping("/current")
    @ResponseBody
    public JacksonProperties.Json getCurrentWeather() {
        return restClient.get()
                .uri("/v1/forecast?latitude=56.16&longitude=10.20&hourly=temperature_2m&timezone=Europe/Copenhagen")
                .retrieve()
                .body(JacksonProperties.Json.class);

    }
}
