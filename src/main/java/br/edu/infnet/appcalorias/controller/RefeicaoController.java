package br.edu.infnet.appcalorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RefeicaoController {
    @GetMapping(value = "/refeicao/lista")
    public String telaLista(){
        return "refeicao/lista";
    }
}
