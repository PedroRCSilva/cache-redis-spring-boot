package com.pedro.weather.api.controller.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class DayResponse {

    private LocalDate date;
    private Double minimumTemperature;
    private Double maximumTemperature;
    private Double humidity;
    private String conditions;
}
