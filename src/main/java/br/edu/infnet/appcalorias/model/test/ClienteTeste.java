package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.controller.ClienteController;
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
        ClienteController.incluir(cliente1);

        Cliente cliente2 = new Cliente("Sophia Dolfini", 52, 154, 1835);
        ClienteController.incluir(cliente2);

        Cliente cliente3 = new Cliente("Ana Ciarnicoli", 64, 151, 1650);
        ClienteController.incluir(cliente3);




    }


}
