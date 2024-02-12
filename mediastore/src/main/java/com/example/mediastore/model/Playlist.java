package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Playlist {

    @Id
    private Integer playlistId;

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
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
