package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

public class P02_login extends PageBase {
    By login_title = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By login_email_field = By.name("Email");
    By login_email_invalid_field = By.name("Email");
    By login_password_field = By.id("Password");
    By login_tab = By.cssSelector("button[type='submit'][class='button-1 login-button']");
    By invalid_login_msg = By.xpath("//div[@class='message-error validation-summary-errors' and contains(text()," +
            "'Login was unsuccessful. Please correct the errors and try again.')]");

    public P02_login (WebDriver driver) {super(driver);}
    public  String getLoginTitle () {return driver.findElement(login_title).getText();}
    public void loginEnterEmail (String email) {enterText(login_email_field, email); }
    public void loginEnterPassword (String password ) {enterText(login_password_field, password);}
    public void clickLoginTab () {select(login_tab);}
    public void loginEnterInvalidEmail (String email) {enterText(login_email_invalid_field, email); }
    public String invalidLoginMSG () {return driver.findElement(invalid_login_msg).getText();}
    public String color_fail() {return driver.findElement(invalid_login_msg).getCssValue("color");}
    public String HEX_color_red() { return Color.fromString(color_fail()).asHex();}}


