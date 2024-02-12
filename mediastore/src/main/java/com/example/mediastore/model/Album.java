package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Album {

    public Integer getAlbumId() {
        return album_id;
    }

    public void setAlbumId(Integer albumId) {
        this.album_id = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist_id;
    }

    public void setArtist(Artist artist) {
        this.artist_id = artist;
    }

    @Id
    private Integer album_id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist_id;

    // Constructors, getters, setters...
}
