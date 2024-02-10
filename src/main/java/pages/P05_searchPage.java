package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_searchPage extends PageBase {

    By locate_search_results = By.xpath("//div[@class='product-item']");
    By locate_product_title = By.cssSelector("h2.product-title");

    By locate_sku = By.cssSelector("div.sku");

    By searchProduct = By.xpath("//div[@class=\"details\"] //a[@href=\"/htc-one-m8-android-l-50-lollipop\"]");
    public P05_searchPage (WebDriver driver) {super(driver);}

   public int actualCount() {
   List<WebElement> searchResults =  driver.findElements(locate_search_results);
   int actualCount = searchResults.size();
   return actualCount;}

    public List<WebElement> wordResult() {
        List<WebElement> searchResults = driver.findElements(locate_product_title);
       return searchResults;
    }

    public void clickProduct () {select(searchProduct);
    }
    public List<WebElement> skuResult() {
        List<WebElement> searchResult = driver.findElements(locate_sku);
        return searchResult;
    }}


