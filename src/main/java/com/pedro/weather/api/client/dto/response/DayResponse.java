package com.pedro.weather.api.client.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class DayResponse implements Serializable {
    @JsonProperty("datetime")
    private LocalDate date;
    @JsonProperty("tempmin")
    private Double minimumTemperature;
    @JsonProperty("tempmax")
    private Double maximumTemperature;
    private Double humidity;
    private String conditions;
}
