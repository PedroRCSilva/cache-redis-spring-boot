package com.pedro.weather.api.model;

import com.pedro.weather.api.controller.dto.response.DayResponse;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Weather implements Serializable {
    private Double latitude;
    private Double longitude;
    private String address;
    private List<Day> days;
}
