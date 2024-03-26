package com.example.api.model;
/*
* When discussing a "model" in the context of the Model-View-Controller (MVC) architectural pattern,
* it typically refers to the "M" in MVC. In MVC, the Model represents the data and business logic of the application.

 * */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;






}
