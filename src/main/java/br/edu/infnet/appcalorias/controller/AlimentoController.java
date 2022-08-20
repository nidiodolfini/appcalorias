package br.edu.infnet.appcalorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlimentoController {
    @GetMapping(value = "/alimento/lista")
    public String telaLista(){
        return "alimento/lista";
    }
}
