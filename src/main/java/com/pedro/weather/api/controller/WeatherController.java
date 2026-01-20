package com.pedro.weather.api.controller;

import com.pedro.weather.api.controller.dto.request.SearchParams;
import com.pedro.weather.api.controller.dto.response.DayResponse;
import com.pedro.weather.api.controller.dto.response.WeatherResponse;
import com.pedro.weather.api.controller.mapper.WeatherMapper;
import com.pedro.weather.api.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public ResponseEntity<WeatherResponse> getWeather(SearchParams searchParams){
        var weather = WeatherMapper.toResponse(weatherService.getWeather(searchParams));
        return ResponseEntity.ok(weather);
    }

}
