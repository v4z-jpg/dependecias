package br.com.tech4me.dependecias.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/dependencia")

public class DependenciaController {
    
    @GetMapping
    public String respondeRequisicaoGet() {
        return "erick gay7";
    }
}
