package com.pedro.weather.api.client.mapper;

import com.pedro.weather.api.client.dto.response.WeatherResponse;
import com.pedro.weather.api.model.Weather;

public class WeatherMapper {

    public static Weather toModel(WeatherResponse weatherResponse){
        return Weather.builder()
                .address(weatherResponse.getAddress())
                .days(weatherResponse.getDays().stream().map(DayMapper::toModel).toList())
                .latitude(weatherResponse.getLatitude())
                .longitude(weatherResponse.getLongitude()).build();
    }
}
