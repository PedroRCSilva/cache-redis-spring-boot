package com.pedro.weather.api.controller.dto.request;

import lombok.Data;

@Data
public class SearchParams {
    private String city;
    private String unitConsumer;
    private String include;
}
