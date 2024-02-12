package com.example.mediastore.mapper;

import com.example.mediastore.dto.ArtistDTO;
import com.example.mediastore.model.Artist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ArtistMapper {

    ArtistMapper INSTANCE = Mappers.getMapper(ArtistMapper.class);

    @Mapping(target = "artistId", source = "artistId")
    @Mapping(target = "name", source = "name")
    ArtistDTO artistToArtistDTO(Artist artist);

    List<ArtistDTO> artistToDTOs(List<Artist> entities);
}

