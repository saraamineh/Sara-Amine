package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.P04_homePage;
import pages.P07_subcategory;

import java.util.List;

import static org.example.stepDefs.TestBase.driver;


public class D05_hoverCategoriesStepDef {
    P04_homePage HP = new P04_homePage(driver);
    P07_subcategory SC = new P07_subcategory(driver);
    Actions Actions = new Actions(driver);
    int random = -1;
    String subCategory = "";

    @When("user hoovers on one category")
    public void userHooversOnOneCategory() throws InterruptedException {
        int min = 0;
        int max = 2;
     random =  (int)Math.floor(Math.random()*(max-min+1)+min);
     Actions.moveToElement(HP.categories().get(random)).perform();
     Thread.sleep(2000);
    }

    @And("selects one sub-category")
    public void selectsOneSubCategory() {
        List<WebElement> sub = HP.subCategory(random);
        int min = 0;
        int max = 2;
        random =  (int)Math.floor(Math.random()*(max-min+1)+min);
        subCategory = sub.get(random).toString();
        subCategory = subCategory.substring(subCategory.lastIndexOf("/")+1,subCategory.length()-3);
        subCategory =subCategory.replace("-","");
        Actions.moveToElement(sub.get(random)).perform();
        Actions.click(sub.get(random)).perform();
    }



    @Then("User is at sub-category page")
    public void userIsAtSubCategoryPage() {
    String title = SC.subCategoryTitle().toLowerCase().trim().replace("&","");
    title = title.replaceAll(" ","");
    Assert.assertTrue(title.contains(subCategory));
    Actions.scrollToElement(SC.subCategoryTitle1()).perform();
    }
}
