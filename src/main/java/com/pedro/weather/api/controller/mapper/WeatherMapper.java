package com.pedro.weather.api.controller.mapper;
import com.pedro.weather.api.controller.dto.response.WeatherResponse;
import com.pedro.weather.api.model.Weather;

public class WeatherMapper {

    public static WeatherResponse toResponse(Weather weatherResponse){
        return WeatherResponse.builder()
                .address(weatherResponse.getAddress())
                .days(weatherResponse.getDays().stream().map(DayMapper::toModel).toList())
                .latitude(weatherResponse.getLatitude())
                .longitude(weatherResponse.getLongitude()).build();
    }
}
