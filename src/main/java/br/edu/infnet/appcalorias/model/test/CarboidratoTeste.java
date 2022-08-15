package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.model.domain.Carboidrato;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class CarboidratoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Carboidrato carb1 = new Carboidrato();
        carb1.setNome("Banana");
        carb1.setCalorias(84);
        carb1.setGrama(90);
        carb1.setProteina(6);
        carb1.setCarboidrato(8);
        carb1.setGordura(2);
        carb1.setComplexo(true);
        carb1.setIndiceGlicemico(10);
        carb1.setFibra(38);
        AppImpressao.relatorio("Inclusão Banana", carb1);

        Carboidrato carb2 = new Carboidrato();
        carb2.setNome("Morango");
        carb2.setCalorias(25);
        carb2.setGrama(300);
        carb2.setProteina(0);
        carb2.setCarboidrato(23);
        carb2.setGordura(0);
        carb2.setComplexo(true);
        carb2.setIndiceGlicemico(5);
        carb2.setFibra(42);
        AppImpressao.relatorio("Inclusão Morango", carb2);

        Carboidrato carb3 = new Carboidrato();
        carb3.setNome("Pão francês");
        carb3.setCalorias(125);
        carb3.setGrama(50);
        carb3.setProteina(0);
        carb3.setCarboidrato(38);
        carb3.setGordura(5);
        carb3.setComplexo(false);
        carb3.setIndiceGlicemico(98);
        carb3.setFibra(8);
        AppImpressao.relatorio("Inclusão Pão francês", carb3);





    }


}
