package br.edu.infnet.appcalorias.controller;

import br.edu.infnet.appcalorias.model.domain.Refeicao;
import br.edu.infnet.appcalorias.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RefeicaoController {

    private static Map<Integer, Refeicao> mapaRefeicao = new HashMap<Integer, Refeicao>();

    private static Integer id = 1;

    public static void incluir(Refeicao refeicao){
        refeicao.setId(id++);
        mapaRefeicao.put(refeicao.getId(),refeicao);
        AppImpressao.relatorio("Inclusão de " + refeicao.getDescricao() + " realizada ", refeicao);
    }
    public static Collection<Refeicao> obterLista(){
        return mapaRefeicao.values();
    }
    public static void excluir(Integer id){
        mapaRefeicao.remove(id);
    }
    @GetMapping(value = "/refeicao/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "refeicao/lista";
    }
    @GetMapping(value = "/refeicao/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/refeicao/lista";
    }
}
