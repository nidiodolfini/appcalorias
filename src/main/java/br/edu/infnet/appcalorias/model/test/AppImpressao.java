package br.edu.infnet.appcalorias.model.test;

import br.edu.infnet.appcalorias.interfaces.IPrinter;

public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter printer){
        System.out.println(mensagem);
        printer.impressao();
    }
}
