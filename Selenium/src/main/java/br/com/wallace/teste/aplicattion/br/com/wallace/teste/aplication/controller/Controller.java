package br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.controller;

import br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.crawler.util.IncluiDados;
import br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.navegador.BrowserDriver;

/**
 * Created by FINCH-WALLACE on 23/06/2017.
 */
public class Controller {
    private IncluiDados incluiDados = new IncluiDados();

    public void controlaFluxo() throws InterruptedException {
        BrowserDriver browser = new BrowserDriver();
        incluiDados.incluir(browser);
    }

}
