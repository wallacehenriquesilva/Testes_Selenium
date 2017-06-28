package br.com.wallace.teste.crawler.constantes;

import java.util.List;

/**
 * Created by FINCH-WALLACE on 23/06/2017.
 */
public class XPath {

    public static final String FNAME = "//input[@ng-model='FirstName']";
    public static final String LNAME = "//input[@ng-model='LastName']";

    public static final String ADDRESS = "//textarea[@ng-model='Adress']";
    public static final String EMAIL = "//input[@ng-model='EmailAdress']";
    public static final String PHONE = "//input[@ng-model='Phone']";

    public static final String GENDER = "//input[@value='Male']";

    public static final String[] HOBBIES = {"//input[@value='Cricket']", "//input[@value='Movies']", "//input[@value='Hockey']"};

    public static final String LANGUAGE = "//a[contains(.,'Danish')]";

    public static final String LANGUAGET = "  //div[@id='msdd']";

    public static final String SKILL = "//option[@value='Android']";

    public static final String COUNTRY = "//option[contains(@value,'Angola')]";

    public static final String SELECTED = "//select[@id='country']/option[11]";

    public static final String ANOS = "//select[@id='yearbox']/option[@value='1996']";
    public static final String MES = "//select[@ng-model='monthbox']/option[@value='7']";
    //select[@ng-model='monthbox']
    public static final String DIA = "//select[@id='daybox']/option[@value='3']";

    public static final String FSenha = "//input[@id='firstpassword']";
    public static final String SSenha = "//input[@id='secondpassword']";

    public static final String BTNUPLOAD = "//input[@id='imagesrc']";


    public static final String BTN_DOWNLOAD = "//a[@class='btn btn-primary']";

    public static final String BTN_UPLOAD = "//input[@id='input-4']";
    public static final String N_PROCESSO = "//input[@id='numeracaounica']";
    public static final String N_DV = "//input[@id='dv']";
    public static final String ANO = "//input[@id='anodois']";
    public static final String ORIGEM = "//input[@id='origemdois']";



    public static final String N_EMAIL = "//div[@data-bind='text: hintText, css: hintCss']";
    public static final String N_SENHA = "passwd";
    public static final String BTN_NEXT = "//input[@class='btn btn-block btn-primary']";


    public static final String TD1 = "//div[@class='_u7i']/table/tbody/tr/td[1]";


    //MERCADO LIVRE



}
