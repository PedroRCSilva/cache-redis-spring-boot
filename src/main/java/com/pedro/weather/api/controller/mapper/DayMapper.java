package com.pedro.weather.api.controller.mapper;

import com.pedro.weather.api.controller.dto.response.DayResponse;
import com.pedro.weather.api.model.Day;

public class DayMapper {

    public static DayResponse toModel(Day day){
        return DayResponse.builder()
                .conditions(day.getConditions())
                .humidity(day.getHumidity())
                .maximumTemperature(day.getMaximumTemperature())
                .minimumTemperature(day.getMinimumTemperature())
                .date(day.getDate())
                .build();
    }
}
