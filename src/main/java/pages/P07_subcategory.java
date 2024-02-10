package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_subcategory extends PageBase {

    By subCategory_page_title = By.tagName("h1");
    public P07_subcategory (WebDriver driver) {super(driver);}

    public String subCategoryTitle () {
    return driver.findElement(subCategory_page_title).getText();
    }

    public WebElement subCategoryTitle1 () {
        return driver.findElement(subCategory_page_title);
    }
}
