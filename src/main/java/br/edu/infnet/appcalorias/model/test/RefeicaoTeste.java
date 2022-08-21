package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.controller.AlimentoController;
import br.edu.infnet.appcalorias.controller.RefeicaoController;
import br.edu.infnet.appcalorias.model.domain.*;
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
    public void run(ApplicationArguments args) throws Exception {

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
        alimentos.add(lipidio1);
        alimentos.add(lipidio1);

        Cliente cliente1 = new Cliente("Nidio Dolfini", 109, 184, 2204);

        Cliente cliente2 = new Cliente("Sophia Dolfini", 52, 154, 1835);

        Cliente cliente3 = new Cliente("Ana Ciarnicoli", 64, 151, 1650);

        Refeicao ref1 = new Refeicao(cliente1);
        ref1.setDescricao("Almoço");
        ref1.setCalorias(250);
        ref1.setAlimentos(alimentos);
        RefeicaoController.incluir(ref1);

        Refeicao ref2 = new Refeicao(cliente2);
        ref2.setDescricao("Janta");
        ref2.setCalorias(185);
        ref2.setAlimentos(alimentos);
        RefeicaoController.incluir(ref2);

        Refeicao ref3 = new Refeicao(cliente3);
        ref3.setDescricao("Café da tarde");
        ref3.setCalorias(150);
        ref3.setAlimentos(alimentos);
        RefeicaoController.incluir(ref3);

    }


}
