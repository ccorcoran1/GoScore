package com.GoScore.GoScore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GoScore.GoScore.entities.Player;
import com.GoScore.GoScore.repositories.PlayerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor  
public class PlayerService {

    private final PlayerRepository playerRepository;
    
    public List<Player> getAllPlayers() {
        return playerRepository.findAllPlayers();
    }

    public Player getPlayerById(String id) {
        try {
            Long playerId = Long.parseLong(id);
            return playerRepository.findPlayerById(playerId).orElse(null);
        } catch (NumberFormatException e) {
            return null; // Return null if the ID is not a valid number
        }
    }
}
