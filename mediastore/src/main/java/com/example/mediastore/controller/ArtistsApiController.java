package com.example.mediastore.controller;

import com.example.mediastore.dto.ArtistDTO;
import com.example.mediastore.dto.ArtistInfoDTO;
import com.example.mediastore.service.ArtistService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistsApiController implements ArtistsApi {

    private static final Logger log = LoggerFactory.getLogger(ArtistsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final ArtistService artistService;
    @org.springframework.beans.factory.annotation.Autowired
    public ArtistsApiController(ObjectMapper objectMapper, HttpServletRequest request, ArtistService artistService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.artistService = artistService;
    }

    public ResponseEntity<List<ArtistDTO>> getAllArtists() {
        String accept = request.getHeader("Accept");
        List<ArtistDTO> artistDTOs = artistService.getAllArtists();
        return new ResponseEntity<>(artistDTOs, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ArtistInfoDTO>> getArtistById(Integer artistId) {
        List<ArtistInfoDTO> artistInfoDTOS = artistService.getArtistById(artistId);
        return new ResponseEntity<>(artistInfoDTOS, HttpStatus.OK);
    }

}
