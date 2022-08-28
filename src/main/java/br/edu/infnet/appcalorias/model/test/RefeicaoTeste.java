package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.controller.AlimentoController;
import br.edu.infnet.appcalorias.controller.RefeicaoController;
import br.edu.infnet.appcalorias.model.domain.*;
import br.edu.infnet.appcalorias.model.exceptions.AlimentoException;
import br.edu.infnet.appcalorias.model.exceptions.ClienteNullException;
import br.edu.infnet.appcalorias.model.exceptions.CpfInvalidoException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Order(1)
public class RefeicaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        Set<Alimento> alimentos = new HashSet<Alimento>();
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
        alimentos.add(carb1);


        Proteina proteina1 = new Proteina();
        proteina1.setNome("Feijão");
        proteina1.setCalorias(84);
        proteina1.setGrama(90);
        proteina1.setProteina(6);
        proteina1.setCarboidrato(8);
        proteina1.setGordura(2);
        proteina1.setVegetal(true);
        proteina1.setIncompleta(true);
        proteina1.setValorBiologico(20);
        alimentos.add(proteina1);

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
        alimentos.add(lipidio1);

        Cliente cliente1 = null;
        try {

            cliente1 = new Cliente("361828","Nidio Dolfini", 109, 184, 2204);
            Refeicao ref1 = new Refeicao(cliente1, alimentos);
            ref1.setDescricao("Almoço");
            ref1.setCalorias(250);
            RefeicaoController.incluir(ref1);
        } catch (CpfInvalidoException | ClienteNullException | AlimentoException e) {
            System.out.println("[ERRO] - Solicitante" + e.getMessage());
        }
        try {
            Cliente cliente2 = new Cliente("361282","Sophia Dolfini", 52, 154, 1835);
            Refeicao ref2 = new Refeicao(cliente2, alimentos);
            ref2.setDescricao("Janta");
            ref2.setCalorias(185);
            RefeicaoController.incluir(ref2);
        } catch (CpfInvalidoException | ClienteNullException | AlimentoException e) {
            System.out.println("[ERRO] - Solicitante" + e.getMessage());
        }
        try {
            Cliente cliente3 = new Cliente("371661","Ana Ciarnicoli", 64, 151, 1650);
            Refeicao ref3 = new Refeicao(cliente3, alimentos);
            ref3.setDescricao("Café da tarde");
            ref3.setCalorias(150);
            RefeicaoController.incluir(ref3);
        } catch (CpfInvalidoException | ClienteNullException | AlimentoException e) {
            System.out.println("[ERRO] - Solicitante" + e.getMessage());
        }

    }


}
