package com.example.mediastore.dto;

public class StatDTO {
    private Integer artistId;

    private String name;

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

    public Integer getMaxyears() {
        return maxyears;
    }

    public void setMaxyears(Integer maxyears) {
        this.maxyears = maxyears;
    }

    private Integer maxyears;

}
