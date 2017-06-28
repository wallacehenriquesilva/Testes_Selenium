package br.com.wallace.teste.crawler.util;

import br.com.wallace.teste.crawler.constantes.Constantes;
import br.com.wallace.teste.crawler.constantes.XPath;
import br.com.wallace.teste.navegador.BrowserDriver;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.openqa.selenium.*;

import java.io.File;
import java.util.List;

/**
 * Created by FINCH-WALLACE on 23/06/2017.
 */
public class IncluiDados {
    public void incluir(BrowserDriver wb) throws InterruptedException {
        try {


            System.out.println("Preenchendo dados");
            wb.getBrowser().get(Constantes.URL);
            wb.getBrowser().findElement(By.xpath(XPath.FNAME)).sendKeys(Constantes.F_NAME);
            wb.getBrowser().findElement(By.xpath(XPath.LNAME)).sendKeys(Constantes.L_NAME);
            wb.getBrowser().findElement(By.xpath(XPath.ADDRESS)).sendKeys(Constantes.ADDRESS);
            wb.getBrowser().findElement(By.xpath(XPath.EMAIL)).sendKeys(Constantes.EMAIL);
            wb.getBrowser().findElement(By.xpath(XPath.PHONE)).sendKeys(Constantes.PHONE);

            wb.getBrowser().findElement(By.xpath(XPath.GENDER)).click();


            wb.getBrowser().findElement(By.xpath(XPath.LANGUAGET)).click();
            wb.getBrowser().findElement(By.xpath(XPath.LANGUAGE)).click();


            for (int i = 0; i <= 2; i++) {
                wb.getBrowser().findElement(By.xpath(XPath.HOBBIES[i])).click();
            }


            wb.getBrowser().findElement(By.xpath(XPath.SKILL)).click();

            wb.getBrowser().findElement(By.xpath(XPath.COUNTRY)).click();

            wb.getBrowser().findElement(By.xpath(XPath.SELECTED)).click();

            wb.getBrowser().findElement(By.xpath(XPath.ANOS)).click();
            wb.getBrowser().findElement(By.xpath(XPath.MES)).click();
            wb.getBrowser().findElement(By.xpath(XPath.DIA)).click();


            wb.getBrowser().findElement(By.xpath(XPath.FSenha)).sendKeys(Constantes.SENHA);
            wb.getBrowser().findElement(By.xpath(XPath.SSenha)).sendKeys(Constantes.SENHA);



            //  wb.getBrowser().findElement(By.xpath(XPath.selected)).click();
            //wb.getBrowser().findElement(By.xpath(XPath.selected)).sendKeys("Aus");


          /* if (wb.getBrowser().findElement(By.xpath(XPath.TEST)).isEnabled()) {
                System.out.println("Este Email já esta registrado");
            }*/

           /* JavascriptExecutor js = (JavascriptExecutor) wb.getBrowser();
            String script = "document.getElementById(\"imagesrc\").setAttribute(\"value\", \"C:\\Users\\FINCH-WALLACE\\Downloads\\img1.jpg\")";
            js.executeScript(script);

            File file = new File(Constantes.CAMINHO);*/
           /* Thread.sleep(2000);
            try {
                wb.getBrowser().findElement(By.xpath(XPath.BTNUPLOAD)).click();
                Thread.sleep(2000);
                wb.getBrowser().findElement(By.xpath(XPath.BTNUPLOAD)).sendKeys(Constantes.CAMINHO);
                wb.getBrowser().findElement(By.xpath(XPath.BTNUPLOAD)).submit();


            } catch (Exception ex) {
                System.out.print("Erro da imagem: " + ex);
            }
            //    wb.getBrowser().findElement(By.xpath(XPath.selected)).submit();

            //   wb.getBrowser().findElement(By.xpath(XPath.btnLogin)).click();*/
        } catch (Exception e) {
            System.out.println(e);
        }


/*
        wb.getBrowser().get(Constantes.URL_DOWNLOAD);

        wb.getBrowser().findElement(By.xpath(XPath.BTN_DOWNLOAD)).click();

        wb.getBrowser().get(Constantes.URL_UPLOAD);

*/
        //    wb.getBrowser().get(Constantes.URL_UPLOAD);

        /*//Muda ID do button
        JavascriptExecutor js = (JavascriptExecutor) wb.getBrowser();
        String script = "document.getElementById(\"input-4\").setAttribute(\"id\", \"id-teste\")";
        js.executeScript(script);
        //Muda ID do button

        String br = wb.getBrowser().findElement(By.xpath(XPath.BTN_UPLOAD)).getAttribute("id");
        System.out.println("--------------------------------------------");
        System.out.println("Valor do id do Button " + br);
        System.out.println("--------------------------------------------");

 /*
        wb.getBrowser().findElement(By.xpath(XPath.BTN_UPLOAD)).click();
        Thread.sleep(2000);
        wb.getBrowser().findElement(By.xpath(XPath.BTN_UPLOAD)).sendKeys(Constantes.CAMINHO_UPLOAD);
        wb.getBrowser().findElement(By.xpath(XPath.BTN_UPLOAD)).submit();
*/

    }
}
