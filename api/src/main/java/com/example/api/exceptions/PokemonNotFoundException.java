package com.example.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PokemonNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1;

    public PokemonNotFoundException(String message){
        super(message);
    }
}
