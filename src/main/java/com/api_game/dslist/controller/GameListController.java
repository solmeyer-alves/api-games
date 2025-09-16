package com.api_game.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_game.dslist.dto.GameListDTO;
import com.api_game.dslist.dto.GameMinDTO;
import com.api_game.dslist.dto.ReplacementDTO;
import com.api_game.dslist.services.GameListService;
import com.api_game.dslist.services.GameService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/lists")
@Tag(name = "Lists", 
description = "Manage and search game lists / Busca e gerencia listas de jogos")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	@Operation(summary = "List genres of the registered games / Lista os generos dos jogos cadastrados")
	
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "All games in the lists / Todos os jogos nas listas"),
			@ApiResponse(responseCode = "400", description = "Not found / Nao encontrado")
	})
	public List<GameListDTO> listAll(){
		List<GameListDTO> result = gameListService.listAll();
		return result;
	}
	
	@Operation(summary = "Seacrh games by id from the list / Busca os jogos por id da lista")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found successfully / Encontrado com sucesso"),
			@ApiResponse(responseCode = "400", description = "Not found / Nao encontrado")
	})
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
	@Operation(summary = "changes the order of the games / altera a ordem de posição dos jogos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "successfully replaced / substituído com sucesso"),
			@ApiResponse(responseCode = "400", description = "Check the necessary parameters / Verifique os parêmetros necessários")
	})
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body ){
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	
	}

}
