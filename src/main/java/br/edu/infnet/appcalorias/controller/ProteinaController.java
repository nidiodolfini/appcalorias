package br.edu.infnet.appcalorias.controller;

import br.edu.infnet.appcalorias.model.domain.Proteina;
import br.edu.infnet.appcalorias.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ProteinaController {
    private static Map<Integer, Proteina> mapaProteina = new HashMap<Integer, Proteina>();
    private static Integer id =1;

    public static void incluir(Proteina proteina){
        proteina.setId(id++);
        mapaProteina.put(proteina.getId(), proteina);
        AppImpressao.relatorio("Inclusão de "+ proteina.getNome() + " realizada ", proteina);
    }
    public static Collection<Proteina> obterLista(){
        return mapaProteina.values();
    }
    public static void excluir(Integer id){
        mapaProteina.remove(id);
    }
    @GetMapping(value = "/proteina/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "proteina/lista";
    }
    @GetMapping(value = "/proteina/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/proteina/lista";
    }
}
