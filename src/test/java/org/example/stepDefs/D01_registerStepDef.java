package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P01_register;
import pages.P03_successRegister;
import pages.P04_homePage;

import static org.example.stepDefs.TestBase.driver;

public class D01_registerStepDef {
    P01_register RP = new P01_register(driver);
    P04_homePage HP = new P04_homePage(driver);
    P03_successRegister SR = new P03_successRegister(driver);
    SoftAssert Soft = new SoftAssert();

    @Given("user is at home page")
    public void user_is_at_home_page() {
        Assert.assertEquals(HP.getHomeTitle(), "Welcome to our store");
    }

    @When("he clicks on register tab")
    public void he_clicks_on_register_tab() {
     HP.clickRegisterTab();
     Assert.assertEquals(RP.getRegisterTitle(), "Register");
    }

    @And("chooses his gender {string}")
    public void chooses_his_gender(String Gender) {
    if (Gender.equals("Male"))
    RP.selectMale();
    else if (Gender.equals("Female")) {
    RP.selectFemale();}
    }

    @And("enters his first name {string}")
    public void enters_his_first_name (String firstName) {
    RP.enterFName(firstName);
    }

    @And("enters his last name {string}")
    public void enters_his_last_name(String lastName) {
        RP.enterLName(lastName);
    }

    @And("chooses his day {string}")
    public void chooses_his_day(String dayOfBirth) {
    RP.selectDB(dayOfBirth);
    }

    @And("chooses his month {string}")
    public void chooses_his_month(String monthOfBirth) {
    RP.selectMB(monthOfBirth);
    }

    @And("chooses his year {string}")
    public void chooses_his_year(String yearOfBirth) {
    RP.selectYB(yearOfBirth);
    }

    @And("enters his email {string}")
    public void enters_his_email(String email) {
    RP.enterEmail(email);
    }

    @And("clicks on news letter button")
    public void clicks_on_news_letter_button() {
    RP.selectNewsLetter();
    }

    @And("enters his password {string}")
    public void enters_his_password(String password) {
    RP.enterPassword(password);
    }

    @And("confirms his password {string}")
    public void confirms_his_password(String password) {
    RP.enterConfirmPassword(password);
    }

    @Then("clicks on register button")
    public void clicks_on_register_button() {
    RP.clickRegister();
    }

    @And("a successful message should be displayed {string}")
    public void a_successful_message_should_be_displayed(String actual_success_msg) {
       Soft.assertEquals(SR.getSuccessText(), "Your registration completed");
       Soft.assertEquals(SR.getColor(),"rgba(76, 177, 124, 1)");
       Soft.assertAll();
}

    @And("a continue button should be displayed")
    public void a_continue_button_should_be_displayed() {SR.clickContinueButton();}
    }



