package com.example.api.services;


import com.example.api.dto.PokemonDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PokemonService {

    PokemonDto createPokemon(PokemonDto pokemonDto);

    List<PokemonDto> getAllPokemons();

    PokemonDto getPokemonById(Long id);

    PokemonDto updatePokemon(PokemonDto pokemonDto, Long id);
}
