package br.com.wallace.teste.crawler.util;

import br.com.wallace.teste.crawler.constantes.Constantes;
import br.com.wallace.teste.crawler.constantes.XPath;
import br.com.wallace.teste.navegador.BrowserDriver;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.text.normalizer.RangeValueIterator;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.List;

/**
 * Created by FINCH-WALLACE on 26/06/2017.
 */
public class JogoDaVelha {
    public void jogar(BrowserDriver wb) throws InterruptedException {
        System.out.println("Jogando");
        wb.getBrowser().get(Constantes.URL_GOOGLE);
        Thread.sleep(2000);
        wb.getBrowser().findElement(By.xpath("//div[@class='_u7i']/table[1]/tbody[1]/tr[1]/td[1]")).click();
        Thread.sleep(2000);
        wb.getBrowser().findElement(By.xpath("//div[@class='_u7i']/table[1]/tbody[1]/tr[3]/td[3]")).click();
        Thread.sleep(2000);
        wb.getBrowser().findElement(By.xpath("//div[@class='_u7i']/table[1]/tbody[1]/tr[1]/td[2]")).click();
        Thread.sleep(2000);

        List<WebElement> listElement = wb.getBrowser().findElements(By.xpath("//div[@class='_u7i']/table[1]/tbody[1]/tr[1]/td/svg"));
        System.out.println("Quantidade de itens na lista: " + listElement.size());
        System.out.println("Valor do 1° Item " + listElement.get(0));
        System.out.println("-*-*-*-*-*-*-*-*-*-*");
       System.out.println("Valor do campo: " + wb.getBrowser().findElement(By.xpath("//div[@class='_u7i']/table[1]/tbody[1]/tr[1]/td[1]/svg[1]")).getAttribute("aria-label"));

       // wb.getBrowser().findElement(By.xpath(XPath.LNAME)).sendKeys(Constantes.L_NAME);
        //wb.getBrowser().findElement(By.xpath(XPath.ADDRESS)).sendKeys(Constantes.ADDRESS);

        //ImageIO.write(ImageIO.read(new URL("https://www.hushmail.com/signup/turingimage?hush_domain=hushmail.com")), "jpg", new File("C:\\captcha.jpg"));

    }
}
