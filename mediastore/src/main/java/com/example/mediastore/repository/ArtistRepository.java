package com.example.mediastore.repository;

import com.example.mediastore.dto.StatDTO;
import com.example.mediastore.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    // une méthode pour récupérer tous les artistes
    List<Artist> findAll();

    @Query("SELECT NEW com.example.mediastore.dto.StatDTO(a.artist_id, a.name, MAX(artistYears.consecutiveYears)) " +
            "FROM Artist a " +
            "JOIN Album al ON a.artist_id = al.artist_id " +
            "JOIN Track t ON al.album_id = t.album_id " +
            "JOIN InvoiceLine il ON t.track_id = il.track_id " +
            "JOIN LATERAL (SELECT il.track_id.album_id.artist_id AS artist_id, EXTRACT(YEAR FROM il.invoice_id.invoice_date) AS invoiceYear, " +
            "COUNT(DISTINCT il.invoice_id) AS consecutiveYears " +
            "FROM InvoiceLine il " +
            "WHERE il.track_id.album_id = al.album_id  " +
            "GROUP BY il.track_id.album_id.artist_id, EXTRACT(YEAR FROM il.invoice_id.invoice_date) " +
            "HAVING COUNT(DISTINCT il.track_id) >= 3) AS artistYears " +
            "ON a.artist_id = artistYears.artist_id " +
            "GROUP BY a.artist_id, a.name")
    List<StatDTO> findArtistsWithMaxConsecutiveYears();
}

