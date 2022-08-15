package br.edu.infnet.appcalorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarboidratoController {
    @GetMapping(value = "/carboidrato/lista")
    public String telaLista(){
        return "carboidrato/lista";
    }
}
