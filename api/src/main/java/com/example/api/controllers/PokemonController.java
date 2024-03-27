package com.example.api.controllers;

import com.example.api.dto.PokemonDto;
import com.example.api.model.Pokemon;
import com.example.api.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("api/")
public class PokemonController {

    private PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("pokemons")
    public ResponseEntity<List<PokemonDto>> getPokemons(){

        return ResponseEntity.ok(pokemonService.getAllPokemons());
    }

    @GetMapping("pokemon/{id}")
    public ResponseEntity<PokemonDto> getPokemonById(@PathVariable Long id) {

        return ResponseEntity.ok(pokemonService.getPokemonById(id));
    }

//    POST API END POINT
    @PostMapping("pokemon/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PokemonDto> createPokemon(@RequestBody PokemonDto pokemonDto){
        System.out.println(pokemonDto.getName());
        System.out.println(pokemonDto.getType());
        return new ResponseEntity<>(pokemonService.createPokemon(pokemonDto), HttpStatus.CREATED);
    }


//    PUT
    @PutMapping("pokemon/update/{id}")
    public ResponseEntity<PokemonDto> updatePokemon(@RequestBody PokemonDto pokemonDto, @PathVariable("id") Long pokemonId){
        PokemonDto response = pokemonService.updatePokemon(pokemonDto, pokemonId);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

//    DELETE
    @DeleteMapping("pokemon/delete/{id}")
    public ResponseEntity<String> deletePokemon(@PathVariable("id") int pokemonId){
        System.out.println(pokemonId);

        return ResponseEntity.ok("Pokemon deleted successfully");
    }
}
