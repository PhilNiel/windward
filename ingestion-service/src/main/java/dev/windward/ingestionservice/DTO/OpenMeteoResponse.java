package dev.windward.ingestionservice.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record OpenMeteoResponse(
        Long latitude,
        Long longitude,
        String time,
        Hourly hourly
) {
    public record Hourly(
            List<String> time,
            @JsonProperty("temperature_2m") List<Double> temperature
    ){}
}
