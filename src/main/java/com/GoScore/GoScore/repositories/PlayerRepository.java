package com.GoScore.GoScore.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.GoScore.GoScore.entities.Player;

@Repository 
public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query (value = "SELECT * FROM players", nativeQuery = true)
    public List<Player> findAllPlayers();

    @Query (value = "SELECT * FROM players WHERE id = ?1", nativeQuery = true)
    public java.util.Optional<Player> findPlayerById(Long id);

}
