package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.interfaces.IPrinter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter printer){
        System.out.println(mensagem);
        printer.impressao();
    }

    public static void main(String[] args) {
        String dir = "c:/dev/";
        String arq = "refeicao.txt";
        try {
            FileReader fileReader = new FileReader(dir+arq);
            BufferedReader leitura = new BufferedReader(fileReader);


            String linha = leitura.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = leitura.readLine();
            }
            leitura.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Não leu");
        } catch (IOException e) {
            System.out.println("Exceção de erro");
        } finally {
            System.out.println("Finally");
        }

    }
}
