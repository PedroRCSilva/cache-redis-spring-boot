package com.pedro.weather.api.controller.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class WeatherResponse {

    private Double latitude;
    private Double longitude;
    private String address;
    private List<DayResponse> days;
}
