package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.model.domain.Carboidrato;
import br.edu.infnet.appcalorias.model.domain.Proteina;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Order(1)
public class ProteinaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Proteina proteina1 = new Proteina();
        proteina1.setNome("Feijão");
        proteina1.setCalorias(84);
        proteina1.setGrama(90);
        proteina1.setProteina(6);
        proteina1.setCarboidrato(8);
        proteina1.setGordura(2);
        proteina1.setVegetal(true);
        proteina1.setIncompletas(true);
        proteina1.setValorBiologico(20);
        AppImpressao.relatorio("Inclusão Feijão", proteina1);

        Proteina proteina2 = new Proteina();
        proteina2.setNome("Carne");
        proteina2.setCalorias(84);
        proteina2.setGrama(90);
        proteina2.setProteina(6);
        proteina2.setCarboidrato(8);
        proteina2.setGordura(2);
        proteina2.setVegetal(false);
        proteina2.setIncompletas(false);
        proteina2.setValorBiologico(98);
        AppImpressao.relatorio("Inclusão Carne", proteina2);

        Proteina proteina3 = new Proteina();
        proteina3.setNome("Frango");
        proteina3.setCalorias(84);
        proteina3.setGrama(90);
        proteina3.setProteina(6);
        proteina3.setCarboidrato(8);
        proteina3.setGordura(2);
        proteina3.setVegetal(false);
        proteina3.setIncompletas(false);
        proteina3.setValorBiologico(82);
        AppImpressao.relatorio("Inclusão Frango", proteina3);

    }


}
