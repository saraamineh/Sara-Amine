package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_searchResult extends PageBase {

    By locate_sku = By.xpath("//div[@class='sku']");
    public P06_searchResult (WebDriver driver) {super(driver);}
    public  String getSku () {
        return driver.findElement(locate_sku).getText();}
}
