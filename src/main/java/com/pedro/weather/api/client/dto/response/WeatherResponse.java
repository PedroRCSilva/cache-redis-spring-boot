package com.pedro.weather.api.client.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse {
    private Double latitude;
    private Double longitude;
    private String address;
    private List<DayResponse> days;
}
