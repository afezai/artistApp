package com.example.mediastore.repository;

import com.example.mediastore.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    // une méthode pour récupérer tous les artistes
    List<Artist> findAll();

    @Query("SELECT a.artist_id, a.name AS artist_name, MAX(consecutive_years) AS max_consecutive_years FROM Artist a JOIN " +
            "Album al ON a.artist_id = al.artist_id JOIN Track t ON al.album_id = t.album_id " +
            "JOIN Invoice_line il ON t.track_id = il.track_id " +
            "JOIN (SELECT artist_id, EXTRACT(YEAR FROM il.invoice_date) " +
            "AS invoice_year, COUNT(DISTINCT il.invoice_id) AS consecutive_years " +
            "FROM invoice_line il GROUP BY artist_id, EXTRACT(YEAR FROM il.invoice_date)" +
            " HAVING COUNT(DISTINCT il.track_id) >= 3) " +
            "AS artist_years ON a.artist_id = artist_years.artist_id GROUP BY a.artist_id, a.name")
    List<Object[]> findArtistsWithMaxConsecutiveYears();
}

