
package com.example.mediastore.controller;

import com.example.mediastore.dto.StatDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Validated
public interface StatisticsApi {

    @RequestMapping(value = "api/statistics/maxConsecutiveYears",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<StatDTO>> statisticsMaxConsecutiveYearsGet();

}

