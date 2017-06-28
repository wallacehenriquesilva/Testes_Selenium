package br.com.wallace.teste.crawler;

import br.com.wallace.teste.crawler.constantes.Constantes;
import br.com.wallace.teste.crawler.constantes.XPath;
import br.com.wallace.teste.navegador.BrowserDriver;
import org.openqa.selenium.By;

/**
 * Created by FINCH-WALLACE on 26/06/2017.
 */
public class Email {
    public void envia(BrowserDriver browser){
//Inicia o browser no site
        browser.getBrowser().get(Constantes.URL_EMAIL);
        //
        browser.getBrowser().findElement(By.xpath(XPath.N_EMAIL)).sendKeys(Constantes.EMAIL);
        //
        browser.getBrowser().findElement(By.xpath(XPath.BTN_NEXT)).click();

        //

    }
}
