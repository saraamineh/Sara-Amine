package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_successRegister extends PageBase {

    By actual_success_msg = By.xpath("//div[@class='result']");
    By continue_button = By.xpath("//a[@class='button-1 register-continue-button']");

    public P03_successRegister (WebDriver driver) {super(driver);}
    public void clickContinueButton () {select(continue_button);}

    public  String getSuccessText () {
        return driver.findElement(actual_success_msg).getText(); }
    public String getColor() {
        return  driver.findElement(actual_success_msg).getCssValue("color");
    }

}
