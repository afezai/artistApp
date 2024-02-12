package com.example.mediastore.service;

import com.example.mediastore.dto.ArtistDTO;
import com.example.mediastore.dto.StatDTO;
import com.example.mediastore.mapper.ArtistMapper;
import com.example.mediastore.model.Artist;
import com.example.mediastore.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    // Méthode pour récupérer tous les artistes
    public List<ArtistDTO> getAllArtists() {
        List<Artist> artists = artistRepository.findAll();
        return ArtistMapper.INSTANCE.artistToDTOs(artists);
    }

    public ArtistDTO getArtistById(Integer artistId) {
        Artist artistEntity = artistRepository.findById(artistId).orElse(null);
        return ArtistMapper.INSTANCE.artistToArtistDTO(artistEntity);
    }

    public List<Object[]> getMaxYears() {
        return artistRepository.findArtistsWithMaxConsecutiveYears();
    }
}
