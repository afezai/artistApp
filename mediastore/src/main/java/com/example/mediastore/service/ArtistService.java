package com.example.mediastore.service;

import com.example.mediastore.dto.ArtistDTO;
import com.example.mediastore.dto.ArtistInfoDTO;
import com.example.mediastore.dto.StatDTO;
import com.example.mediastore.mapper.ArtistMapper;
import com.example.mediastore.model.Artist;
import com.example.mediastore.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<ArtistInfoDTO> getArtistById(Integer artistId) {
        List<Object[]> result = artistRepository.findArtistAndAlbumDetails(artistId);
        List<ArtistInfoDTO> finalres = new ArrayList<ArtistInfoDTO>();
        for (Object[] row : result) {
            finalres.add(new ArtistInfoDTO((String) row[0], (String) row[1], (String) row[2], (Long) row[3]));
        }

        return finalres;
    }

    public List<StatDTO> getMaxYears() {
        return artistRepository.findArtistsWithMaxConsecutiveYears();
    }
}
