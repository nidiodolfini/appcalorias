package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.model.domain.Carboidrato;
import br.edu.infnet.appcalorias.model.domain.Lipidio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class LipidioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Lipidio lipidio1 = new Lipidio();
        lipidio1.setNome("Abacate");
        lipidio1.setCalorias(84);
        lipidio1.setGrama(90);
        lipidio1.setProteina(6);
        lipidio1.setCarboidrato(8);
        lipidio1.setGordura(2);
        lipidio1.setGorduraBoa(true);
        lipidio1.setAcidosGraxos(10);
        lipidio1.setTipoGordura("Poli");
        AppImpressao.relatorio("Inclusão Abacate", lipidio1);

        Lipidio lipidio2 = new Lipidio();
        lipidio2.setNome("Ovo");
        lipidio2.setCalorias(108);
        lipidio2.setGrama(13);
        lipidio2.setProteina(6);
        lipidio2.setCarboidrato(8);
        lipidio2.setGordura(2);
        lipidio2.setGorduraBoa(true);
        lipidio2.setAcidosGraxos(10);
        lipidio2.setTipoGordura("Mono");
        AppImpressao.relatorio("Inclusão Ovo", lipidio2);

        Lipidio lipidio3 = new Lipidio();
        lipidio3.setNome("Manteiga");
        lipidio3.setCalorias(206);
        lipidio3.setGrama(13);
        lipidio3.setProteina(6);
        lipidio3.setCarboidrato(8);
        lipidio3.setGordura(29);
        lipidio3.setGorduraBoa(true);
        lipidio3.setAcidosGraxos(18);
        lipidio3.setTipoGordura("Saturada");
        AppImpressao.relatorio("Inclusão Manteiga", lipidio3);
    }


}
