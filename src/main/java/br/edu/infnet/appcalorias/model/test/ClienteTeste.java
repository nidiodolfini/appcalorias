package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.controller.ClienteController;
import br.edu.infnet.appcalorias.model.domain.Cliente;
import br.edu.infnet.appcalorias.model.exceptions.CpfInvalidoException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ClienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args){


        try {
            Cliente  cliente1 = new Cliente("361828","Nidio Dolfini", 109, 184, 2204);
            ClienteController.incluir(cliente1);
        } catch (Exception e) {
            System.out.println("[ERRO]" + e.getMessage());
        }

        try {
        Cliente cliente2 = new Cliente("361282","Sophia Dolfini", 0, 154, 1835);
        ClienteController.incluir(cliente2);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }

        try {
        Cliente cliente3 = new Cliente("371661","Ana Ciarnicoli", 64, 151, 1650);
        ClienteController.incluir(cliente3);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }





    }


}
