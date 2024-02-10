package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase   {
    WebDriver driver;
    public PageBase (WebDriver driver) {this.driver = driver;}
    void enterText (By webElement, String Text ) {driver.findElement(webElement).sendKeys(Text);}
    public void select (By webElement) {driver.findElement(webElement).click();}

    public void scroll (By webElement) {
        WebElement element = driver.findElement(webElement);
        String script = "arguments[0].scrollIntoView()";
        ((JavascriptExecutor) driver).executeScript(script, element);
    }

    public String getURL() {
        return driver.getCurrentUrl();}





}

