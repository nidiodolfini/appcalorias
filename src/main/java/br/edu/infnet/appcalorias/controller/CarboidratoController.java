package br.edu.infnet.appcalorias.controller;

import br.edu.infnet.appcalorias.model.domain.Carboidrato;
import br.edu.infnet.appcalorias.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class CarboidratoController {
    private static Map<Integer, Carboidrato> mapaCarboidrato = new HashMap<Integer,Carboidrato>();
    private static Integer id = 1;
    public static void incluir(Carboidrato carboidrato){
        carboidrato.setId(id++);
        mapaCarboidrato.put(carboidrato.getId(), carboidrato);
        AppImpressao.relatorio("Inclusão de "+ carboidrato.getNome()+ " realizada ", carboidrato);
    }
    public static Collection<Carboidrato> obterLista(){
        return mapaCarboidrato.values();
    }
    public static void excluir(Integer id){
        mapaCarboidrato.remove(id);
    }
    @GetMapping(value = "/carboidrato/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());
        return "carboidrato/lista";
    }
    @GetMapping(value = "/carboidrato/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/carboidrato/lista";
    }
}
