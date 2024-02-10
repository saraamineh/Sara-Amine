package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P04_homePage;

import static org.example.stepDefs.TestBase.driver;

public class D06_homeSlidersStepDef {
    P04_homePage HP = new P04_homePage(driver);



    @When("user clicks on Galaxy S22 slider")
    public void user_clicks_on_galaxy_s22_slider() {
       HP.clickGalaxySlider();

    }

    @Then("user is directed to Galaxy s{int}  page")
    public void userIsDirectedToGalaxySPage(int arg0) {
        Assert.assertEquals(HP.getURL(), "https://demo.nopcommerce.com/galaxy-s22-ultra");
    }

    @When("user clicks on iphone {int} pro")
    public void user_clicks_on_iphone_pro(Integer int1) {
    HP.clickIphoneSlider();
    }

    @Then("user is directed to {string}")
    public void user_is_directed_to(String string) {
    Assert.assertEquals(HP.getURL(), "//demo.nopcommerce.com/iphone-14-pro ");
    }
}
