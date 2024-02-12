package com.example.mediastore.dto;

public class ArtistDTO {

    private Integer artistId;
    private String name;

    // Constructors, getters, setters...

    public ArtistDTO() {
    }

    public ArtistDTO(Integer artistId, String name) {
        this.artistId = artistId;
        this.name = name;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

