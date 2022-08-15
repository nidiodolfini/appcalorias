package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ClienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Cliente cliente1 = new Cliente("Nidio Dolfini", 109, 184, 2204);
        AppImpressao.relatorio("Inclusão Cliente 1", cliente1);

        Cliente cliente2 = new Cliente("Sophia Dolfini", 52, 154, 1835);
        AppImpressao.relatorio("Inclusão Cliente 2", cliente2);

        Cliente cliente3 = new Cliente("Ana Ciarnicoli", 64, 151, 1650);
        AppImpressao.relatorio("Inclusão Cliente 3", cliente3);



    }


}
