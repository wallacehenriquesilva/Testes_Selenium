package br.com.wallace.teste.crawler;

import br.com.wallace.teste.crawler.constantes.Constantes;
import br.com.wallace.teste.crawler.constantes.XPath;
import br.com.wallace.teste.navegador.BrowserDriver;
import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;
import org.apache.xpath.res.XPATHErrorResources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.xml.bind.Element;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by FINCH-WALLACE on 27/06/2017.
 */
public class MercadoLivre {
    private static final Pattern NUMERO_ITENS = Pattern.compile("(\\d+)");
    //int qtd = 0;


    public void pesquisar(BrowserDriver browserDriver, String pesquisa) {
        int qtd = 0;
        try {
            System.out.println("Pesquisando dados");
            browserDriver.getBrowser().get(Constantes.URL_MERCADO_LIVRE + pesquisa);

            //Pega o elemento que contem a quantidade total
            WebElement e = browserDriver.getBrowser().findElement(By.xpath(XPath.RESULT_QTD));

            System.out.println("Quantidade total da pesquisa " + e.getText());
            //Regex apenas do numero
            Matcher matcher = NUMERO_ITENS.matcher(e.getText().toString());
            if (matcher.find()) {

                qtd = Integer.parseInt(matcher.group(1));
                System.out.println("Quantidade " + qtd);
            }



          //  int tamanho = listElementos.size();
            int paginas = qtd / 50;
            int n = 1;
            ///System.out.println("Tamanho da lista " + listElementos.size());
            for (int i = 0; i < paginas; i++) {
                browserDriver.getBrowser().get(Constantes.URL_MERCADO_LIVRE + pesquisa + "_Desde_" + n);

                List<WebElement> listElementos = browserDriver.getBrowser().findElements(By.xpath(XPath.ITENS));
                for (WebElement element : listElementos) {
                    //WebElement we = element.findElement(By.xpath(XPath.ITEM_VALOR)).ge;
                    System.out.println("Valor: " + element.findElement(By.xpath(XPath.ITEM_VALOR)).getText());
                    System.out.println("Descricao: " + element.findElement(By.xpath("./h2/span[@class='main-title']")).getText());
                }
                n+=50;
            }
            //listElementos.forEach(System.out::println);


        } catch (Exception e) {

        }
    }
}
