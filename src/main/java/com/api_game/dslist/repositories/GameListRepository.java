package com.api_game.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_game.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
