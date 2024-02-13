package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class Track {

    @Id
    private Integer track_id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album_id;

    @ManyToOne
    @JoinColumn(name = "media_type_id")
    private MediaType mediaType;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre_id;

    public Integer getTrack_id() {
        return track_id;
    }

    public void setTrack_id(Integer track_id) {
        this.track_id = track_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbum() {
        return album_id;
    }

    public void setAlbum(Album album) {
        this.album_id = album;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Genre getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Genre genre) {
        this.genre_id = genre;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    private String composer;
    private Integer milliseconds;
    private Integer bytes;
    private BigDecimal unitPrice;

    // Constructors, getters, setters...
}
