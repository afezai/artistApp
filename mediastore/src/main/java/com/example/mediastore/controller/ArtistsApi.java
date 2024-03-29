
package com.example.mediastore.controller;

import com.example.mediastore.dto.ArtistDTO;
import com.example.mediastore.dto.ArtistInfoDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Validated
public interface ArtistsApi {

    @RequestMapping(value = "api/artists",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ArtistDTO>> getAllArtists();

    @RequestMapping(value = "api/artists/{artistId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<ArtistInfoDTO>> getArtistById(@PathVariable Integer artistId);
}

