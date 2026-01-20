package com.pedro.weather.api.service;

import com.pedro.weather.api.client.WeatherClient;
import com.pedro.weather.api.client.mapper.WeatherMapper;
import com.pedro.weather.api.controller.dto.request.SearchParams;
import com.pedro.weather.api.model.Weather;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient client;

    @Cacheable(value = "weather")
    public Weather getWeather(SearchParams searchParams){
        return WeatherMapper.toModel(client.getWeather(searchParams.getCity(),searchParams.getUnitConsumer(),searchParams.getInclude()));
    }
}
