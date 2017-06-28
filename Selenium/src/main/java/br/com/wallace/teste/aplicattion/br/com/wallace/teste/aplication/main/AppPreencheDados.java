package br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.main;

import br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.controller.Controller;

/**
 * Created by FINCH-WALLACE on 23/06/2017.
 */
public class AppPreencheDados {
    private static Controller controller = new Controller();

    public static void main(String[] args) {
        System.out.println("********************************************************************");
        System.out.println("  automationtesting - Preenchimento automatico");
        System.out.println("********************************************************************");

        try {
            controller.controlaFluxo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("********************************************************************");
        System.out.println("  ENCERRANDO AUTOMA��O");
    }
}
