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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/games")
@Tag(name = "Games", 
description = "Returns all registered games / Retorna todos os jogos cadastrados")
public class GameController {
	
	@Autowired
	private GameService Gameservice;
	
	@Operation(summary = "Search game by id / Busca jogo por id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Game found successfully / Jogo encontrado com sucesso"),
			@ApiResponse(responseCode = "400", description = "Not found / Nao encontrado")
	})
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = Gameservice.findById(id);
		return result;
	}
	
	
	@Operation(summary = "List all games registered / Lista todos os jogos registrados")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "List of games / Lista de jogos"),
			@ApiResponse(responseCode = "400", description = "Not found / Nao encontrado")
	})
	@GetMapping
	public List<GameMinDTO> listAll(){
		List<GameMinDTO> result = Gameservice.listAll();
		return result;
	}
	
}
