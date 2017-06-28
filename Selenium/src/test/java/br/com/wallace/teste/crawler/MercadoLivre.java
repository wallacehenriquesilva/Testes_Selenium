package br.com.wallace.teste.crawler;

import br.com.wallace.teste.model.ProdutoModel;
import br.com.wallace.teste.navegador.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by FINCH-WALLACE on 27/06/2017.
 */
public class MercadoLivre {
    //REGEX
    private static final Pattern NUMERO_ITENS = Pattern.compile("(\\d+)");

    //CONSTANSTES
    public static final String URL_MERCADO_LIVRE = "http://lista.mercadolivre.com.br/";

    //XPATH
    public static final String RESULT_QTD = "//div[@id='inner-main']/aside[@class='filters grid']/div[@class='quantity-results']";
    public static final String ITENS = "//ol[@id='searchResults']/li/div/a/div[@class='item__info ']";
    public static final String ITEM_VALOR = "./div[@class='item__price ']/span[@class='price-fraction']";
    public static final String ITEM_DESCRICAO = "./h2/span[@class='main-title']";

    //int qtd = 0;


    public void search(BrowserDriver browserDriver, String pesquisa) {
        int qtd = 0;
        try {
            System.out.println("Pesquisando dados");
            browserDriver.getBrowser().get(URL_MERCADO_LIVRE + pesquisa);

            //Pega o elemento que contem a quantidade total
            WebElement e = browserDriver.getBrowser().findElement(By.xpath(RESULT_QTD));

            System.out.println("Quantidade total da pesquisa " + e.getText());

            //Regex apenas do numero
            Matcher matcher = NUMERO_ITENS.matcher(e.getText().toString());
            if (matcher.find()) {

                qtd = Integer.parseInt(matcher.group(1));
                System.out.println("Quantidade " + qtd);
            }



            int paginas = qtd / 50;
            int n = 1;
            ArrayList<ProdutoModel> listProduto = new ArrayList<>();
            ProdutoModel produto;

            ///System.out.println("Tamanho da lista " + listElementos.size());
            for (int i = 0; i <= paginas; i++) {
                browserDriver.getBrowser().get(URL_MERCADO_LIVRE + pesquisa + "_Desde_" + n);

                List<WebElement> listElementos = browserDriver.getBrowser().findElements(By.xpath(ITENS));
                /*for (WebElement element : listElementos) {
                    produto = new ProdutoModel();
                    //WebElement we = element.findElement(By.xpath(XPath.ITEM_VALOR)).ge;
                    //System.out.println("Valor: " + element.findElement(By.xpath(XPath.ITEM_VALOR)).getText());
                    //System.out.println("Descricao: " + element.findElement(By.xpath("./h2/span[@class='main-title']")).getText());
                    produto.setProPreco(Integer.parseInt(element.findElement(By.xpath(XPath.ITEM_VALOR)).getText().replace(".", "")));
                    produto.setProDesc(element.findElement(By.xpath("./h2/span[@class='main-title']")).getText().toString());
                    listProduto.add(produto);

                }*/
                //
                listElementos.stream()
                        .map(this::createProduto)
                        .forEach(listProduto::add);
                n += 50;
            }

            //Exibe todos os dados da lista, usando o toString @Override
            listProduto.forEach(System.out::println);


        } catch (Exception e) {

        }
    }

    private ProdutoModel createProduto(WebElement webElement) {
        ProdutoModel model = new ProdutoModel();
        model.setProPreco(Integer.parseInt(webElement.findElement(By.xpath(ITEM_VALOR)).getText().replace(".", "")));
        model.setProDesc(webElement.findElement(By.xpath(ITEM_DESCRICAO)).getText().toString());
        return model;
    }
}
