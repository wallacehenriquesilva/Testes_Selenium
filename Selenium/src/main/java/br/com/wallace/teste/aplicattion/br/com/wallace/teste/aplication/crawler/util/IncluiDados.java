package br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.crawler.util;

import br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.crawler.constantes.Constantes;
import br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.crawler.constantes.XPath;
import br.com.wallace.teste.aplicattion.br.com.wallace.teste.aplication.navegador.BrowserDriver;
import org.openqa.selenium.By;

/**
 * Created by FINCH-WALLACE on 23/06/2017.
 */
public class IncluiDados {
    public void incluir(BrowserDriver wb) {
        try{
            System.out.println("Preenchendo dados");
            wb.getBrowser().get(Constantes.URL);
            wb.getBrowser().findElement(By.xpath(XPath.fName)).sendKeys(Constantes.F_NAME);
            wb.getBrowser().findElement(By.xpath(XPath.lName)).sendKeys(Constantes.L_NAME);
         //   wb.getBrowser().findElement(By.xpath(XPath.btnLogin)).click();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
