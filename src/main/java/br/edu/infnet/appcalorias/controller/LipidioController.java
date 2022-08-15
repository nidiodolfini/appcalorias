package br.edu.infnet.appcalorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LipidioController {
    @GetMapping(value = "/lipidio/lista")
    public String telaLista(){
        return "lipidio/lista";
    }
}
