package com.pedro.weather.api.client.mapper;

import com.pedro.weather.api.client.dto.response.DayResponse;
import com.pedro.weather.api.model.Day;

public class DayMapper {

    public static Day toModel(DayResponse dayResponse){
        return Day.builder()
                .conditions(dayResponse.getConditions())
                .humidity(dayResponse.getHumidity())
                .maximumTemperature(dayResponse.getMaximumTemperature())
                .minimumTemperature(dayResponse.getMinimumTemperature())
                .date(dayResponse.getDate())
                .build();
    }
}
