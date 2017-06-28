package br.com.wallace.teste.controller;

import br.com.wallace.teste.crawler.Email;
import br.com.wallace.teste.crawler.MercadoLivre;
import br.com.wallace.teste.crawler.TestaAlerta;
import br.com.wallace.teste.crawler.Trt15;
import br.com.wallace.teste.crawler.util.IncluiDados;
import br.com.wallace.teste.crawler.util.JogoDaVelha;
import br.com.wallace.teste.navegador.BrowserDriver;

/**
 * Created by FINCH-WALLACE on 23/06/2017.
 */
public class Controller {
    private IncluiDados incluiDados = new IncluiDados();
    private JogoDaVelha jogo = new JogoDaVelha();
    private Trt15 trt = new Trt15();
    private TestaAlerta alerta = new TestaAlerta();
    private Email email = new Email();
    public MercadoLivre ml = new MercadoLivre();

    public void controlaFluxo() throws InterruptedException {
        BrowserDriver browser = new BrowserDriver();
        //incluiDados.incluir(browser);
        //uploadImagem.upload(browser);
        // jogo.jogar(browser);
        //trt.incluir(browser);
        //alerta.incluir(browser);
        //email.envia(browser);
        ml.search(browser, "tv-plasma");
    }

}
