package br.edu.infnet.appcalorias.model.test;


import br.edu.infnet.appcalorias.controller.RefeicaoController;
import br.edu.infnet.appcalorias.model.domain.*;
import br.edu.infnet.appcalorias.model.exceptions.AlimentoException;
import br.edu.infnet.appcalorias.model.exceptions.ClienteNullException;
import br.edu.infnet.appcalorias.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appcalorias.model.exceptions.FibraException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        try {
            carb1.setFibra(38);
        } catch (FibraException e) {
            System.out.println("[ERRO -- Fibra ]" + e.getMessage());
        }
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

        String dir = "c:/dev/";
        String arq = "refeicao.txt";
        try {
            FileReader fileReader = new FileReader(dir + arq);
            BufferedReader leitura = new BufferedReader(fileReader);
            System.out.printf("leitura" + leitura);

            String linha = leitura.readLine();
            System.out.println("linha" + linha);
            while (linha != null) {
                System.out.println(linha);
                try {
                    String[] campos = linha.split(";");
                    Cliente cliente1 = new Cliente(campos[2], campos[3], Integer.parseInt(campos[4]), Integer.parseInt(campos[5]), Integer.parseInt(campos[6]));
                    Refeicao ref1 = new Refeicao(cliente1, alimentos);
                    ref1.setDescricao(campos[0]);
                    ref1.setCalorias(Integer.parseInt(campos[1]));
                    RefeicaoController.incluir(ref1);
                } catch (CpfInvalidoException | ClienteNullException | AlimentoException e) {
                    System.out.println("[ERRO] - Solicitante" + e.getMessage());
                }
                linha = leitura.readLine();
            }
            leitura.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Exceção de entrada IO");
        } finally {
            System.out.println("Finally");
        }
    }
}
