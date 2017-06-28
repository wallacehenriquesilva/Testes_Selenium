package br.com.wallace.teste.crawler.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by FINCH-WALLACE on 26/06/2017.
 */
public class ChecaAlerta {
    public static boolean checaAlerta(WebDriver driver, String texto) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            if (alert.getText().contains(texto)) {
                alert.accept();
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public String mensagemAlerta(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            return alert.getText();

        } catch (Exception e) {
            return "";
        }

    }
}
