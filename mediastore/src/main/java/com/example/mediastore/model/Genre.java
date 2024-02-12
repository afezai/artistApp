package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Genre {

    @Id
    private Integer genreId;

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
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

