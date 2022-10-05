package com.proyecto.petshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/")
    public String helloWorld()
    {
        return "Hola Mundo con SpringBoot";
    }
}
