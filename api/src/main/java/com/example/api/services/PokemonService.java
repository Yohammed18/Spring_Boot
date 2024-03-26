package com.example.api.services;


import com.example.api.dto.PokemonDto;
import org.springframework.stereotype.Service;

@Service
public interface PokemonService {

    PokemonDto createPokemon(PokemonDto pokemonDto);
}
