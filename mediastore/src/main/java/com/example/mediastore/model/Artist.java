package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Artist {

    @Id
    private Integer artist_id;

    public Integer getArtistId() {
        return artist_id;
    }

    public void setArtistId(Integer artistId) {
        this.artist_id = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    // Constructors, getters, setters...
}
