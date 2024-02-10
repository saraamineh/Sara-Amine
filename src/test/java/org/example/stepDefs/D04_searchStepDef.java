package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P04_homePage;
import pages.P05_searchPage;
import pages.P06_searchResult;

import static org.example.stepDefs.TestBase.driver;


public class D04_searchStepDef {

    P04_homePage HP = new P04_homePage(driver);
    P05_searchPage SP = new P05_searchPage(driver);
    P06_searchResult SR = new P06_searchResult(driver);
    SoftAssert Soft = new SoftAssert();
    Actions Actions = new Actions(driver);

    @When("user searches using product name {string}")
    public void user_searches_using_product_name(String productName) {
        HP.setSearchBox(productName);
        HP.pressSearch();}

    @Then("page moves to search page")
    public void page_moves_to_search_page() {
        Actions.scrollToElement(SP.wordResult().get(SP.wordResult().size()-1)).perform();
        Assert.assertTrue(SP.getURL().contains("https://demo.nopcommerce.com/search?q"));
    }

    @And("Search shows relevant results")
    public void search_shows_relevant_results() {

      Soft.assertEquals(SP.actualCount(), 3);
        for (WebElement result : SP.wordResult()) {
            String text = result.getText().toLowerCase();
      Soft.assertTrue(text.contains("camera"));}
      Soft.assertAll();
        }

    @When("user searches using product sku {string}")
    public void userSearchesUsingProductSku(String sku) {
        HP.setSearchBox(sku);
        HP.pressSearch();}


    @And("User clicks on the product in search result")
    public void userClicksOnTheProductInSearchResult() {
       SP.clickProduct();
    }

    @Then("Sku shown in this page contains the sku that you are using in search")
    public void skuShownInThisPageContainsTheSkuThatYouAreUsingInSearch() {
        Assert.assertTrue(SR.getSku().contains("M8_HTC_5L"));

    }
}
