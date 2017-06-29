package br.com.wallace.teste.crawler;

import br.com.wallace.teste.model.ProdutoModel;
import br.com.wallace.teste.navegador.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
            Integer numeroResultados = Optional.ofNullable(browserDriver.getBrowser().findElement(By.xpath(RESULT_QTD)))
                    .map(WebElement::getText)
                    .map(NUMERO_ITENS::matcher)
                    .filter(Matcher::find)
                    .map(Matcher::group)
                    .map(Integer::valueOf)
                    .orElse(0);

            System.out.println("Quantidade total da pesquisa " + numeroResultados);

            /*//Regex apenas do numero
            Matcher matcher = NUMERO_ITENS.matcher(e.getText().toString());
            if (matcher.find()) {

                qtd = Integer.parseInt(matcher.group(1));
            }*/
            System.out.println("Quantidade " + numeroResultados);


            int paginas = qtd / 50;
            int n = 1;
            ArrayList<ProdutoModel> listProduto = new ArrayList<>();


            ///System.out.println("Tamanho da lista " + listElementos.size());
            for (int i = 0; i <= paginas; i++) {
                browserDriver.getBrowser().get(URL_MERCADO_LIVRE + pesquisa + "_Desde_" + n);
                try {
                    List<WebElement> listElementos = browserDriver.getBrowser().findElements(By.xpath(ITENS));

                    listElementos.stream()
                            .map(this::createProduto)
                            .forEach(listProduto::add);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

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
        model.setProDesc(Optional.ofNullable(webElement.findElement(By.xpath(ITEM_DESCRICAO)))
                .map(WebElement::getText)
                .orElse(""));
        return model;
    }
}
