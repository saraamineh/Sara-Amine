package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class P01_register extends PageBase {

    By register_title = By.cssSelector("h1:first-child");
    By male_option = By.id("gender-male");
    By female_option = By.id("gender-female");
    By first_name_field = By.id("FirstName");
    By last_name_field = By.id("LastName");
    By day_of_birth_option = By.name("DateOfBirthDay");
    By month_of_birth_option = By.name("DateOfBirthMonth");
    By year_of_birth_option = By.name("DateOfBirthYear");
    By email_field = By.id("Email");
    By news_letter_option = By.id("Newsletter");
    By password_field = By.id("Password");
    By confirm_password_field = By.name("ConfirmPassword");
    By register_tab = By.name("register-button");

    public P01_register(WebDriver driver) {super(driver);}


    public  String getRegisterTitle () {return driver.findElement(register_title).getText(); }
    public void selectMale () {select(male_option); }
    public void selectFemale () {select(female_option);}
    public void enterFName (String firstName) {enterText(first_name_field, firstName);}
    public void enterLName (String lastName) {enterText(last_name_field, lastName);}
    public  void selectDB (String dayOfBirth) {enterText(day_of_birth_option, dayOfBirth);}
    public void selectMB (String monthOfBirth) {enterText(month_of_birth_option, monthOfBirth);}
    public void selectYB (String yearOfBirth) {enterText(year_of_birth_option, yearOfBirth);}
    public void enterEmail (String email) {enterText(this.email_field, email);}
    public void selectNewsLetter () {select(news_letter_option);}
    public  void enterPassword (String password) {enterText(this.password_field, password);}
    public void  enterConfirmPassword (String password) {enterText(confirm_password_field, password);}
    public void clickRegister () {select(register_tab);}}

