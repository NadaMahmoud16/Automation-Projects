package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver){
        super(driver);

    }
    //locators
    By searchInput = By.cssSelector("input[class=\"css-ukkbbr e1n2h7jb1\"]");
    By searchButton = By.cssSelector("button[type=\"submit\"]");
    By datePostedLocator = By.xpath ("//h3[@class='css-1d5tds3']//i[@class='css-1oy4qip efou2fk0']//*[name()='svg']//*[name()='path']");
//            ("//h3[@class='css-1d5tds3']");
    By pastWeekLocator = By.xpath("//div[@class='css-1omce3u']//div[3]//label[1]//div[1]");
    By numberOfJobsFound = By.cssSelector("span[class=\"css-xkh9ud\"]");
    By firstJobLocator = By.xpath("//div[@class=\"css-9i2afk\"]/div[2]/div[1]/div/div[1]/h2/a");
    By applyButton = By.cssSelector("button[class=\"css-1m0yk35 ezfki8j0\"]");
    By firstNameInput = By.cssSelector("input[name=\"firstname\"]");
    By lastNameInput = By.cssSelector("input[name=\"lastname\"]");
    By emailInput = By.cssSelector("input[id=\"email\"]");
    By passwordInput = By.cssSelector("div[class=\"css-sbn8kg e2hijbg0\"] input[name=\"password\"]");
    By signUpButton = By.cssSelector("button[class=\"css-6lejne ezfki8j0\"]");

    //Methods
    public void writeInSearchInput(){write(searchInput, "Software testing");}
    public String getSearchInput (){return returnText(searchInput);}
    public void clickOnSearchButton() {click(searchButton);}
    public String getSearchButtonText() {return returnText(searchButton);}
    //public String getDatePostedText() {return returnText(datePostedLocator);}
    public void clickOnDatePostedLocator(){click(datePostedLocator);}
    //public String getPastWeekText (){return returnText(pastWeekLocator);}
    public void clickOnPastWeekLocator (){click(pastWeekLocator);}
    public String getNumberOfJobsFound (){return returnText(numberOfJobsFound);}
    public void clickOnFirstJobLocator(){click(firstJobLocator);}
    public String getFirstJobText (){return returnText(firstJobLocator);}
    public void clickOnApplyButton (){click(applyButton);}
    public String getApplyButtonText (){return returnText(applyButton);}
    public void writeOnFirstNameInput(String firstName){
        write(firstNameInput, firstName);}
    public String getFirstNameText(){return returnText(firstNameInput);}
    public void writeOnLastNameInput(String lastName){
        write(lastNameInput, lastName);}
    public String getLastNameText(){return returnText(lastNameInput);}
    public void writeOnEmailInput (String email){
        write(emailInput, email);}
    public String getEmailText(){
        return returnText(emailInput);}
    public void writeOnPasswordInput(String password){
        write(passwordInput, password);}
    public String getPasswordInputText(){
        return returnText(passwordInput);}
    public void clickOnSignUpButton(){
        click(signUpButton);}
    public String getSignUpButtonText(){
        return returnText(signUpButton);}

}
