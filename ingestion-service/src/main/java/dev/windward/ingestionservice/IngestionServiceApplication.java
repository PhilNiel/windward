package dev.windward.ingestionservice;

import dev.windward.ingestionservice.controllers.WeatherController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class IngestionServiceApplication {

    public static void main(String[] args) throws URISyntaxException {
        SpringApplication.run(IngestionServiceApplication.class, args);


    }

}
