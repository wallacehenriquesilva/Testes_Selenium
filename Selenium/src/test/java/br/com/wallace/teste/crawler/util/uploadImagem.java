package br.com.wallace.teste.crawler.util;

import br.com.wallace.teste.crawler.constantes.Constantes;
import br.com.wallace.teste.navegador.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * Created by FINCH-WALLACE on 23/06/2017.
 */
public class uploadImagem {
    public static void upload(BrowserDriver wb){
        wb.getBrowser().get(Constantes.URL2);

        /*JavascriptExecutor js = (JavascriptExecutor) wb.getBrowser();
        String script = "document.getElementById(\"input-4\").setAttribute(\"value\", \"C:\\Users\\FINCH-WALLACE\\Downloads\\img1.jpg\")";
        js.executeScript(script); */


        wb.getBrowser().findElement(By.id("input-4")).click();
        wb.getBrowser().findElement(By.id("input-4")).sendKeys(Constantes.CAMINHO);
        wb.getBrowser().findElement(By.id("input-4")).submit();

    }

}
