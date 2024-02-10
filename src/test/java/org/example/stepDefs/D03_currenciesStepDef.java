package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.P04_homePage;

import static org.example.stepDefs.TestBase.driver;

public class D03_currenciesStepDef {

    P04_homePage HP = new P04_homePage(driver);
    Actions Actions = new Actions(driver);

    @When("User clicks the currency drop-down")
    public void user_clicks_the_currency_drop_down() {
       HP.getCurrencyList();
    }

    @And("User selects {string} from the drop-down list")
    public void ser_selects_from_the_drop_down_list(String Euro) {
       HP.selectEuro();

    }

    @Then("The selected currency should be {string}")
    public void the_selected_currency_should_be(String € ) {
    Actions.scrollToElement(HP.getPrices().get(3)).perform();
        for (WebElement Presult : HP.getPrices()) {
            String text = Presult.getText();
        Assert.assertTrue(text.contains("€"));}
}}
