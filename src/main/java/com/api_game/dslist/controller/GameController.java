package com.api_game.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_game.dslist.dto.GameDTO;
import com.api_game.dslist.dto.GameMinDTO;
import com.api_game.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService Gameservice;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = Gameservice.findById(id);
		return result;
	}
	
	@GetMapping
	public List<GameMinDTO> listAll(){
		List<GameMinDTO> result = Gameservice.listAll();
		return result;
	}
	

}
