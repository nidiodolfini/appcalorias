package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.model.domain.Refeicao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
@Order(1)
public class RefeicaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Refeicao ref1 = new Refeicao();
        ref1.setDescricao("Almoço");
        ref1.setCalorias(250);
        ref1.setHorario(LocalDateTime.now());
        AppImpressao.relatorio("Inclusão Almoço", ref1);

        Refeicao ref2 = new Refeicao();
        ref2.setDescricao("Janta");
        ref2.setCalorias(185);
        ref2.setHorario(LocalDateTime.now());
        System.out.println(ref2.toString());
        AppImpressao.relatorio("Inclusão Janta", ref2);

        Refeicao ref3 = new Refeicao();
        ref3.setDescricao("Café da tarde");
        ref3.setCalorias(150);
        ref3.setHorario(LocalDateTime.now());
        System.out.println(ref3.toString());
        AppImpressao.relatorio("Inclusão Café da tarde", ref3);

    }


}
