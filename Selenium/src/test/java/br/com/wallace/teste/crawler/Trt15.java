package br.com.wallace.teste.crawler;

import br.com.wallace.teste.crawler.constantes.Constantes;
import br.com.wallace.teste.crawler.constantes.XPath;
import br.com.wallace.teste.crawler.util.ChecaAlerta;
import br.com.wallace.teste.navegador.BrowserDriver;
import org.openqa.selenium.By;


/**
 * Created by FINCH-WALLACE on 26/06/2017.
 */
public class Trt15 {
    public void incluir(BrowserDriver browser) {
        //Inicia o browser no site
        browser.getBrowser().get("http://demo.automationtesting.in/Alerts.html");
        //coloca o numero do processo
        browser.getBrowser().findElement(By.xpath("//button[@class='btn btn-danger']")).click();

        ChecaAlerta ca = new ChecaAlerta();
        /*if(ca.checaAlerta(browser.getBrowser(), "I am an alert box!")){
            System.out.print("Um alerta foi exibido");
        }*/
        //Pega mensagem do alert
        System.out.println(" Alerta: " + ca.mensagemAlerta(browser.getBrowser()));
        //DV
     /*  browser.getBrowser().findElement(By.xpath(XPath.N_DV)).sendKeys(Constantes.DV);
        //Ano
        browser.getBrowser().findElement(By.xpath(XPath.ANO)).sendKeys(Constantes.ANO);
        //Origem
        browser.getBrowser().findElement(By.xpath(XPath.ORIGEM)).sendKeys(Constantes.ORIGEM);


        browser.getBrowser().findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();*/

    }
}
