package br.edu.infnet.appcalorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProteinaController {
    @GetMapping(value = "/proteina/lista")
    public String telaLista(){
        return "proteina/lista";
    }
}
