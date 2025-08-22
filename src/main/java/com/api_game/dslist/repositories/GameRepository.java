package com.api_game.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_game.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
