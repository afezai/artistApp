package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MediaType {

    @Id
    private Integer mediaTypeId;

    private String name;

    // Constructors, getters, setters...
}

