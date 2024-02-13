package com.example.mediastore.controller;

import com.example.mediastore.dto.ArtistDTO;
import com.example.mediastore.dto.StatDTO;
import com.example.mediastore.service.ArtistService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;


@RestController
public class StatisticsApiController implements StatisticsApi {

    private static final Logger log = LoggerFactory.getLogger(StatisticsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final ArtistService artistService;

    @org.springframework.beans.factory.annotation.Autowired
    public StatisticsApiController(ObjectMapper objectMapper, HttpServletRequest request, ArtistService artistService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.artistService = artistService;
    }

    public ResponseEntity<List<StatDTO>> statisticsMaxConsecutiveYearsGet() {
        String accept = request.getHeader("Accept");
        List<StatDTO> artists = artistService.getMaxYears();
        return new ResponseEntity<>(artists, HttpStatus.OK);
    }

}
