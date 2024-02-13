package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Genre {

    @Id
    private Integer genre_id;

    public Integer getGenreId() {
        return genre_id;
    }

    public void setGenreId(Integer genreId) {
        this.genre_id = genreId;
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

