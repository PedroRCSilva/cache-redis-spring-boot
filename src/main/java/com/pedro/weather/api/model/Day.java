package com.pedro.weather.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Day implements Serializable {
    private LocalDate date;
    private Double minimumTemperature;
    private Double maximumTemperature;
    private Double humidity;
    private String conditions;
}
