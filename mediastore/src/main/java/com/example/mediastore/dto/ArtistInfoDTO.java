package com.example.mediastore.dto;

public class ArtistInfoDTO {

    public ArtistInfoDTO(String name, String album, String genre, Long duration) {
        this.name = name;
        this.album = album;
        this.genre = genre;
        this.duration = duration;
    }

    public ArtistInfoDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    private String name;

        private String album;

        private String genre;

        private  Long duration;
}
