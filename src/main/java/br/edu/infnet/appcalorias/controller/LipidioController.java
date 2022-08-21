package br.edu.infnet.appcalorias.controller;

import br.edu.infnet.appcalorias.model.domain.Lipidio;
import br.edu.infnet.appcalorias.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LipidioController {
    private static Map<Integer, Lipidio> mapaLipidio = new HashMap<Integer, Lipidio>();
    private static Integer id = 1;
    public static void incluir(Lipidio lipidio){
        lipidio.setId(id++);
        mapaLipidio.put(lipidio.getId(),lipidio);
        AppImpressao.relatorio("Inclusão de " + lipidio.getNome() + " realizada ", lipidio);
    }
    public static Collection<Lipidio> obterLista(){
        return mapaLipidio.values();
    }
    public static void excluir(Integer id){
        mapaLipidio.remove(id);
    }
    @GetMapping(value = "/lipidio/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "lipidio/lista";
    }
    @GetMapping(value = "/lipidio/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/lipidio/lista";
    }
}
