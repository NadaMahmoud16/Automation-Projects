package org.example.stepDefs;

import com.beust.ah.A;
import com.github.javafaker.Faker;
import io.cucumber.core.internal.com.fasterxml.jackson.core.io.doubleparser.JavaDoubleParser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.IkeaPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import static org.bouncycastle.cms.RecipientId.password;
import static org.example.stepDefs.Hooks.driver;

public class IkeaTest {

    IkeaPage page = new IkeaPage(driver);
    WebDriverWait wait;
    SoftAssert soft = new SoftAssert();
    Faker faker = new Faker();
    Random random = new Random();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().safeEmailAddress();
    String password = faker.internet().password(16, 20, true, true, true);


    public void scrollDown(int pixels) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(90, " + pixels + ");");
    }


    @Given("Open URL")
    public void open_url() throws InterruptedException {
        soft.assertEquals(driver.getCurrentUrl(), "https://www.ikea.com/eg/en/");
        soft.assertAll();
    }

    @When("Click on sign up link")
    public void clickOnSignUpLink() {
        String signUpText = page.signUpLink.getText();
        page.signUpLink.click();
        soft.assertEquals(signUpText.toLowerCase(), "hej! log in or sign up");
        soft.assertAll();
    }

    @And("Click on create an account")
    public void clickOnCreateAnAccount() {

        String createAccountText = page.createAnAccountLink.getText();
        page.createAnAccountLink.click();
        soft.assertEquals(createAccountText.toLowerCase(), "create account");
        soft.assertAll();
    }

    @And("Sign up with valid data")
    public void SubmitWithValidData() throws InterruptedException {

        page.firstNameInput.sendKeys(firstName);
        page.lastNameInput.sendKeys(lastName);
        page.createEmailInput.sendKeys(email);
        page.createPasswordInput.sendKeys(password);
        page.eyeIconPasswordInput.click();

        scrollDown(500);
        page.checkboxInput.click();

        String createButtonText = page.createAccountButton.getText();
        page.createAccountButton.click();
        soft.assertEquals(createButtonText.toLowerCase(), "create account");
        soft.assertAll();

    }

    @Then("user should sign up to his profile")
    public void userSignUpToHisProfile() {
        String welcomeText = page.welcomeMessage.getText();
        soft.assertTrue(true, welcomeText);
        System.out.println("Welcome message is " + welcomeText);
        soft.assertAll();
    }

    @And("Click on products")
    public void clickOnProducts() throws InterruptedException {

        scrollDown(100);
        String productsText = page.productsLocator.getText();
        page.productsLocator.click();
        soft.assertEquals(productsText.toLowerCase(), "products");
        soft.assertAll();
    }

    @And("Choose specific product sofas")
    public void chooseSpecificProduct() {

        page.furnitureLocator.click();
        String sofaText = page.sofasLocator.getText();
        page.sofasLocator.click();
        String sofaTitleText = page.sofasTitleLocator.getText();
//        soft.assertEquals(sofaText.toLowerCase(), "sofas");
        soft.assertEquals(sofaTitleText.toLowerCase(), "sofas");
        soft.assertAll();
    }

    @And("Sort products from high to low")
    public void sortProductsFrom() throws InterruptedException {

        scrollDown(800);
//        wait.until(ExpectedConditions.elementToBeClickable(page.sortLocator));
        page.acceptCookies.click();
        page.sortLocator.click();
        page.highToLowLocator.click();
        page.sortLocator.click();

    }

    @And("Added three random products to cart and Compare them with products name and prices in the cart")
    public void addedThreeRandomProductsToCartAndCompareThemWithProductsNameAndPricesInTheCart() throws InterruptedException {

        scrollDown(200);
        page.firstItemAddToCart.click();
        Thread.sleep(1000);
//        wait.until(ExpectedConditions.elementToBeClickable(page.firstItemAddToCart)); //error wait is null
        page.firstItem.click();
        String getFirstItemTitleTextPDP = page.firstItemTitleInPD.getText();
        String getFirstItemPriceInPDP = page.firstItemPriceInPD.getText();
        driver.navigate().back();


        scrollDown(1100);
        page.secondItemAddToCart.click();

        page.secondItem.click();
        String getSecondItemTitleTextPDP = page.secondItemTitleInPD.getText();
        String getSecondItemPriceInPDP = page.secondItemPriceInPD.getText();
        driver.navigate().back();

        scrollDown(600);
        String getShowMoreText = page.showMoreButton.getText();
        page.showMoreButton.click();
        soft.assertEquals(getShowMoreText.toLowerCase(), "show more");
        scrollDown(200);
        page.thirdItemAddToCart.click();
        page.thirdItem.click();
        String getThirdItemTitleTextPDP = page.thirdItemTitleInPD.getText();
        String getThirdItemPriceInPDP = page.thirdItemPriceInPD.getText();
        page.basketButton.click();

        String getFirstItemTitleCart = page.firstItemTitleInCard.getText();
        String getFirstItemPriceCart = page.firstItemPriceInCard.getText().replace("EGP", "");
        String getSecondItemTitleCart = page.secondItemTitleInCard.getText();
        String getSecondItemPriceCart = page.secondItemPriceInCard.getText().replace("EGP", "");
        String getThirdItemTitleCart = page.thirdItemTitleInCard.getText();
        String getThirdItemPriceCart = page.thirdItemPriceInCard.getText().replace("EGP", "");

        soft.assertEquals(getFirstItemTitleTextPDP, getFirstItemTitleCart, "Both first item name results are equal");
        soft.assertEquals(getFirstItemPriceInPDP, getFirstItemPriceCart, "Both first item price results are equal");

        soft.assertEquals(getSecondItemTitleTextPDP, getSecondItemTitleCart, "Both second item name results are equal");
        soft.assertEquals(getSecondItemPriceInPDP, getSecondItemPriceCart, "Both second item price results are equal");

        soft.assertEquals(getThirdItemTitleTextPDP, getThirdItemTitleCart, "Both third item name results are equal");
        soft.assertEquals(getThirdItemPriceInPDP, getThirdItemPriceCart, "Both third item price results are equal");

        soft.assertAll();
    }

    @Then("Check the total price in the cart is calculated correctly")
    public void checkTheTotalPriceInTheCartIsCalculatedCorrectly() throws InterruptedException {

        double sum = 0.0;
        List<WebElement> itemsPrices = page.itemsPricesInCart;
        for (WebElement eachItemPrice : itemsPrices){
            String getItemsPrices = eachItemPrice.getText().replace(",", ".");
            double prices = Double.parseDouble(getItemsPrices);
            sum+=prices;
        }
        System.out.println(sum);

        String getTotalPriceInCart = page.totalPriceInCart.getText().replace(",", ".");
        double totalPrice = Double.parseDouble(getTotalPriceInCart);
        System.out.println(totalPrice);

        soft.assertEquals(totalPrice, sum,"Both prices are the same");
        soft.assertAll();
    }

    @And("Move second product in the cart to favourites")
    public void moveSecondProductInTheCartToFavourites() throws InterruptedException {

        String getMoveToFavSecondItemButton = page.moveToFavSecondItemButton.getText();
        page.moveToFavSecondItemButton.click();
        soft.assertEquals(getMoveToFavSecondItemButton.toLowerCase(), "move to favourites");
        soft.assertAll();
    }

    @And("Remove third product from the cart")
    public void removeThirdProductFromTheCart() {
        String getRemoveThirdProductButton = page.removeThirdProductButton.getText();
        page.removeThirdProductButton.click();
        soft.assertEquals(getRemoveThirdProductButton.toLowerCase(), "remove");
        soft.assertAll();
    }

    @Then("check out until user i reach review and pay")
    public void checkOutUntilUserIReachReviewAndPay() {

        String getGoToCheckOutButtonText = page.goToCheckOutButton.getText();
        page.goToCheckOutButton.click();
        soft.assertEquals(getGoToCheckOutButtonText.toLowerCase(), "go to checkout");

        String fullName = faker.name().fullName();
        String phoneNumber = String.valueOf(faker.number().digits(11));
        String address1 = faker.address().fullAddress();
        String address2 = faker.address().buildingNumber();

        page.fullNameCheckOut.sendKeys(fullName);
        page.selectGovernCheckOut.click();
        page.cairoSelection.click();
        page.areaSelection.click();
        page.fifthSettlementSelection.click();
        page.emailInput.sendKeys(email);
        page.phoneNumberCheckOut.sendKeys(phoneNumber);
        page.addressInput.sendKeys(address1);
        page.address2Input.sendKeys(address2);

        String getContinueButton1 = page.continueButton.getText();
        page.continueButton.click();
        String getDeliverDateSelection = page.deliverDateSelection.getText();
        page.deliverDateSelection.click();
        String getDeliveryContinueButton = page.deliveryContinueButton.getText();
        page.deliveryContinueButton.click();

        soft.assertEquals(getDeliveryContinueButton.toLowerCase(), "continue");
        soft.assertEquals(getContinueButton1.toLowerCase(), "continue");
        soft.assertEquals(getDeliverDateSelection, "18");

        soft.assertAll();
    }
}
