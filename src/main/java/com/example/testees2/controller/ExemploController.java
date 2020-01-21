package com.example.testees2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class ExemploController {

    @GetMapping("/{nome}")
    public String exemplo(@PathVariable  String nome) {
        return "Seja Bem Vindo " + nome;
    }

}
