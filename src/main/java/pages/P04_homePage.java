package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class P04_homePage extends PageBase {
    By home_title = By.xpath("//h2[text()='Welcome to our store']");
    By hp_register_tab = By.xpath("//*[@class=\"header-links\"]//a[contains(text(),'Register')]");
    By hp_login_tab = By.xpath("//*[@class=\"header-links\"]//a[contains(text(),'Log in')]");
    By my_account_title = By.xpath("//a[@href='/customer/info' and @class='ico-account']");
    By currency_list = By.id("customerCurrency");
    By euroSelect = By.cssSelector("select[id=\"customerCurrency\"] option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]");
    By prices = By.xpath("//div[@class='prices']");
    By search_box = By.cssSelector("input[id='small-searchterms'][name='q']");
    By search_tab = By.xpath("//button[@class='button-1 search-box-button']");
    By main_category1 = By.xpath("//a[@href='/computers']");
    By main_category2 = By.xpath("//a[@href='/electronics']");
    By main_category3 = By.xpath("//a[@href='/apparel']");
    By sub_category1 = By.cssSelector("a[href='/desktops']");
    By sub_category4 = By.cssSelector("a[href='/camera-photo']");
    By sub_category7 = By.cssSelector("a[href='/shoes']");
    By sub_category2 = By.cssSelector("a[href='/notebooks']");
    By sub_category5 = By.cssSelector("a[href='/cell-phones']");
    By sub_category8 = By.cssSelector("a[href='/clothing']");
    By sub_category3 = By.cssSelector("a[href='/software']");
    By sub_category6 = By.cssSelector("a[href='/others']");
    By sub_category9 = By.cssSelector("a[href='/accessories']");
    By slider_galaxy = By.cssSelector("a.nivo-control[rel='1']");
    By slider_Iphone = By.cssSelector("a.nivo-control[rel='0']");
    public P04_homePage(WebDriver driver) {super(driver);}
    public  String getHomeTitle () {return driver.findElement(home_title).getText();}
    public void clickRegisterTab () {select(hp_register_tab);}

    // Login//
    public void clickLoginTab () {select(hp_login_tab);}
    public  String getAccountTitle () {return driver.findElement(my_account_title).getText();}

    // Currencies //
    public void getCurrencyList () {select(currency_list);}

    public  void selectEuro () {select(euroSelect);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOf(driver.findElement(prices))); }


    public  List<WebElement> getPrices () {
        List<WebElement> Punit = driver.findElements(prices);
        return Punit; }

   // Search //
    public void setSearchBox (String productName) {enterText(this.search_box, productName);}
    public void pressSearch ()  {select(this.search_tab);}

    // Hoover //

    public List<WebElement>  categories () {
    List<WebElement> avatars = new ArrayList<>();
    avatars.add(driver.findElement(main_category1));
    avatars.add(driver.findElement(main_category2));
    avatars.add(driver.findElement(main_category3));
    return avatars;}

    public List<WebElement>  subCategory (int random) {
        List<WebElement> avatars = new ArrayList<>();
        if (random ==0){
        avatars.add(driver.findElement(sub_category1));
            avatars.add(driver.findElement(sub_category2));
            avatars.add(driver.findElement(sub_category3));
        } else if (random ==1) {
            avatars.add(driver.findElement(sub_category4));
            avatars.add(driver.findElement(sub_category5));
            avatars.add(driver.findElement(sub_category6));
        }else{
        avatars.add(driver.findElement(sub_category7));
            avatars.add(driver.findElement(sub_category8));
            avatars.add(driver.findElement(sub_category9));
        }
        return avatars;}


   // Home slider //
   public void clickGalaxySlider () {
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(slider_galaxy));
   element.click();}

   public void clickIphoneSlider () {
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(slider_Iphone));
   element.click();}}
