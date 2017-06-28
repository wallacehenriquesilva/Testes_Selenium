package br.com.wallace.teste.crawler;

import br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.navegador.BrowserDriver;
import br.com.wallace.teste.crawler.constantes.Constantes;
import br.com.wallace.teste.crawler.constantes.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.*;


/**
 * Created by FINCH-WALLACE on 26/06/2017.
 */
public class TestaAlerta {
    public void incluir(BrowserDriver browser) {
        //Inicia o browser no site
        browser.getBrowser().get(Constantes.URL_TRT15);
        //coloca o numero do processo
        browser.getBrowser().findElement(By.xpath(XPath.N_PROCESSO)).sendKeys(Constantes.PROCESSO);
        //DV
    }
}
