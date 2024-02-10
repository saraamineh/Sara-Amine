package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P04_homePage;

import static org.example.stepDefs.TestBase.driver;

public class D02_loginStepDef {
    P02_login LP = new P02_login (driver);
    P04_homePage HP = new P04_homePage(driver);
    SoftAssert Soft = new SoftAssert();

    @When("user press on login tab")
    public void user_press_on_login_tab() {

    {HP.clickLoginTab();
     Assert.assertEquals(LP.getLoginTitle(),"Welcome, Please Sign In!");}
    }

    @When("enters his valid email {string}")
    public void enters_his_valid_email(String email)
     {
         LP.loginEnterEmail(email);
         }


    @And("enters his valid password {string}")
    public void enters_his_valid_password(String password) {
        LP.loginEnterPassword(password);
    }

    @And("user press on login button")
    public void user_press_on_login_button() {
        LP.clickLoginTab();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
       Soft.assertEquals(HP.getURL(), "https://demo.nopcommerce.com/");
       Soft.assertEquals(HP.getAccountTitle(),"My account");
       Soft.assertAll();
    }

    @And("enters his invalid email {string}")
    public void entersHisInvalidEmail(String email) {
            LP.loginEnterInvalidEmail(email);}


    @Then("user can't login and a message is displayed")
    public void userCanTLoginAndAMessageIsDisplayed() {
    Soft.assertTrue(LP.invalidLoginMSG().contains("Login was unsuccessful"));
    Soft.assertEquals(LP.HEX_color_red(),"#e4434b");
    Soft.assertAll();}
}
