package br.com.correios.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static br.com.correios.core.DriverFactory.getDriver;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasePage {


    /**
     *Methots By ID
     */

    public void clickById(String idElemento) {
       getDriver().findElement(By.id(idElemento)).click();
    }

    public void wiriteById(String idElemento, String texto) {
        getDriver().findElement(By.id(idElemento)).sendKeys(texto);
    }

    public String validatesLabelById(String id) throws InterruptedException {
        sleep(1000);
        return getDriver().findElement(By.id(id)).getText().toString();
    }

    public String getValueFieldById(String idElemento) {
        return getDriver().findElement(By.id(idElemento)).getAttribute("value");
    }

    public void clickButtonoByID(String idElemento) {
        getDriver().findElement(By.id(idElemento)).click();
    }

    public void selectOptionComboById(String id, String visibleText) {
        WebElement elemento = getDriver().findElement(By.id(id));
        Select combo = new Select(elemento);
        combo.selectByVisibleText(visibleText);
        assertEquals(visibleText, combo.getFirstSelectedOption().getText());
    }


    /**
     *Methots By CssSelector
     */

    public void wiriteByCssSelector(String cssElemento, String texto) {
        getDriver().findElement(By.cssSelector(cssElemento)).sendKeys(texto);
    }


    public String validateLabelByCssSelector(String css) throws InterruptedException {
        sleep(1000);
        return getDriver().findElement(By.cssSelector(css)).getText().toString();
    }
    public String getValueFieldByCssSlector(String cssElemento) {
        return getDriver().findElement(By.cssSelector(cssElemento)).getAttribute("value").toString();
    }

    public void clickButtonByCssSelector(String cssElemento) {
        getDriver().findElement(By.cssSelector(cssElemento)).click();
    }

    public void selectOptionComboByCssSelector(String css, String visibleText) {
        WebElement elemento = getDriver().findElement(By.cssSelector(css));
        Select combo = new Select(elemento);
        combo.selectByVisibleText(visibleText);
        assertEquals(visibleText, combo.getFirstSelectedOption().getText());
    }


    /**
     *Methots By Xpath
     */

    public void clickButtonByXpath(String xpathElemento) {
        getDriver().findElement(By.xpath(xpathElemento)).click();
    }

    public void wiriteByXpath(String XpathElemento, String texto) {
        getDriver().findElement(By.xpath(XpathElemento)).sendKeys(texto);
    }

    public String validatesLabelByXpath(String xPath) throws InterruptedException {
        sleep(1000);
        return getDriver().findElement(By.xpath(xPath)).getText().toString();

    }

    public String getValueFieldByXpath(String xpathElemento) {
        return getDriver().findElement(By.xpath(xpathElemento)).getAttribute("value").toString();
    }


    public void selectOptionComboByXpath(String xpath, String visibleText) {
        WebElement elemento = getDriver().findElement(By.xpath(xpath));
        Select combo = new Select(elemento);
        combo.selectByVisibleText(visibleText);
        assertEquals(visibleText, combo.getFirstSelectedOption().getText());
    }


    //Métodos by ClassName
    public String validateLabelByClass(String classElemento) throws InterruptedException {
        sleep(1000);
        return getDriver().findElement(By.className(classElemento)).getText().toString();
    }



}