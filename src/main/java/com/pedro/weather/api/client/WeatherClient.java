package com.pedro.weather.api.client;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.pedro.weather.api.client.dto.response.WeatherResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@FeignClient(name="weatherClient")
public interface WeatherClient {

    @GetMapping(value = "/VisualCrossingWebServices/rest/services/timelinepreview/{city}?options=preview&contentType=json")
    WeatherResponse getWeather(@PathVariable String city, @RequestParam String unitGroup, @RequestParam("include") String include);
}
