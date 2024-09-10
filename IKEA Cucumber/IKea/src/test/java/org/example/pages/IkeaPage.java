package org.example.pages;

import com.github.javafaker.Faker;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IkeaPage {

    private WebDriver driver;
    public IkeaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(Hooks.driver, this);

    }

    //locators
    //create an account locators
    @FindBy(xpath= "//a[@class='hnf-btn hnf-btn--small hnf-leading-icon hnf-btn--tertiary hnf-header__profile-link__default']//span[@class='hnf-btn__inner']")
    public WebElement signUpLink;
    @FindBy(xpath = "//button[@data-testid=\"create-account\"]/span/span")
    public WebElement createAnAccountLink;
    @FindBy(xpath= "//input[@id=\"first-name\"]")
    public WebElement firstNameInput;
    @FindBy(xpath= "//input[@id=\"last-name\"]")
    public WebElement lastNameInput;
    @FindBy(xpath= "//input[@id=\"email\"]")
    public WebElement createEmailInput;
    @FindBy(xpath= "//input[@id=\"password\"]")
    public WebElement createPasswordInput;
    @FindBy(xpath= "//button[@class='pp-skapa__btn pp-skapa__btn--xsmall pp-skapa__btn--icon-tertiary pp-skapa__input-field__trailing-icon']")
    public WebElement eyeIconPasswordInput;
    @FindBy(xpath= "//input[@id=\"privacy-policy-checkbox\"]")
    public WebElement checkboxInput;
    @FindBy(xpath = "//button[@data-testid=\"sign-up-create-account\"]")
    public WebElement createAccountButton;
    @FindBy(xpath = "//h1[@class=\"header_header__iQpKh\"]")
    public WebElement welcomeMessage;

    //sofas locators
    @FindBy(xpath =  "//div[@class=\"hnf-overflow-carousel__content\"]/button[1]")
    public WebElement productsLocator;
    @FindBy(xpath = "//div[@id=\"tab-products\"]/div[1]/div[1]/div[1]/div[1]//div[@id=\"hnf-carousel__tabs-navigation-products\"]/div[3]/a[@role='button']/span[contains(text(),'Furniture')]" )
    public WebElement furnitureLocator;
    @FindBy(xpath =  "//div[@id=\"hnf-dropdown-fu001\"]/div/div/ul[2]/li[2]/a[@data-tracking-label=\"fu003\"]")
    public WebElement sofasLocator;
    @FindBy(xpath =  "//h1[@class=\"plp-page-title__title\"]")
    public WebElement sofasTitleLocator;
    @FindBy(xpath =  "//div[@class=\"plp-filter-bar__options\"]/button[1]")
    public WebElement sortLocator;
    @FindBy(xpath =  "//input[@id=\"plp-PRICE_HIGH_TO_LOW\"]")
    public WebElement highToLowLocator;

    @FindBy(xpath = "//div[@class=\"plp-product-list__products \"]//h3")
    public List<WebElement> itemsSelect;
    @FindBy(xpath = "//div[@class=\"plp-product-list__products \"] //div[@class=\"plp-button-container\"]/button[@class=\"plp-btn plp-btn--small plp-btn--icon-emphasised\"]/span")
    public List<WebElement> addToCartButton;

    @FindBy(xpath =  "//div[@class=\"plp-product-list__products \"]/div[1]/div[1]/div[3]/a[1]/div[1]/div[1]/h3[1]/span[1]/span[1]")
    public WebElement firstItem;
    @FindBy(xpath =  "//div[@class='js-product-list']//div[1]//div[1]//div[4]//div[1]//button[1]//span[1]")
    public WebElement firstItemAddToCart;
    @FindBy(xpath =  "//span[@class=\"pip-header-section__title--big notranslate\"]")
    public WebElement firstItemTitleInPD;
    @FindBy(xpath =  "//div[@class=\"pip-temp-price-module__primary-currency-price\"] //span[@class=\"pip-temp-price__integer\"]")
    public WebElement firstItemPriceInPD;
    @FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
    public WebElement acceptCookies;
    @FindBy(xpath =  "//div[@class=\"plp-product-list__products \"]/div[12]/div[1]/div[3]/a[1]/div[1]/div[1]/h3[1]/span[1]/span[1]")
    public WebElement secondItem;
    @FindBy(xpath =  "//div[@class='js-product-list']//div[12]//div[1]//div[4]//div[1]//button[1]//span[1]")
    public WebElement secondItemAddToCart;
    @FindBy(xpath =  "//span[@class=\"pip-header-section__title--big notranslate\"]")
    public WebElement secondItemTitleInPD;
    @FindBy(xpath =  "//div[@class=\"pip-temp-price-module__primary-currency-price\"] //span[@class=\"pip-temp-price__integer\"]")
    public WebElement secondItemPriceInPD;
    @FindBy(xpath = "//a[@aria-label=\"Show more products\"]//span[@class=\"plp-btn__inner\"]")
    public WebElement showMoreButton;
    @FindBy(xpath =  "//div[@class=\"plp-product-list__products \"]/div[13]/div[1]/div[3]/a[1]/div[1]/div[1]/h3[1]/span[1]/span[1]")
    public WebElement thirdItem;
    @FindBy(xpath =  "//div[@class='js-product-list']//div[13]//div[1]//div[4]//div[1]//button[1]//span[1]")
    public WebElement thirdItemAddToCart;
    @FindBy(xpath =  "//span[@class=\"pip-header-section__title--big notranslate\"]")
    public WebElement thirdItemTitleInPD;
    @FindBy(xpath =  "//div[@class=\"pip-temp-price-module__primary-currency-price\"] //span[@class=\"pip-temp-price__integer\"]")
    public WebElement thirdItemPriceInPD;

    @FindBy(xpath = "//span[@class=\"hnf-btn__inner js-shopping-cart-icon\"]")
    public WebElement basketButton;
    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div[1]/div/div/div/div[1]/div[1]/div[2]/span[1]")
    public  WebElement firstItemTitleInCard;
    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div[1]/div/div/div/div[1]/div[2]/div/span/span[1]/span/span[2]")
    public  WebElement firstItemPriceInCard;
    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div[2]/div/div/div/div[1]/div[1]/div[2]/span[1]")
    public  WebElement secondItemTitleInCard;
    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div[2]/div/div/div/div[1]/div[2]/div/span/span[1]/span/span[2]")
    public  WebElement secondItemPriceInCard;
    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div[3]/div/div/div/div[1]/div[1]/div[2]/span[1]")
    public  WebElement thirdItemTitleInCard;
    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div[3]/div/div/div/div[1]/div[2]/div/span/span[1]/span/span[2]")
    public  WebElement thirdItemPriceInCard;

    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div/div/div/div/div[1]/div[2]/div/span/span[1]/span/span[2]")
    public List<WebElement> itemsPricesInCart;
    @FindBy(xpath = "//div[@class=\"Summary_receipt__d7Qzo\"]/div[2]/span[2]/span[1]/span/span[2]")
    public WebElement totalPriceInCart;
    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"] /div/div[2]/div/div/div/div[2]/button[2]/span")
    public WebElement moveToFavSecondItemButton;
    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"] /div/div[3]/div/div/div/div[2]/button[1]/span")
    public WebElement removeThirdProductButton;
    @FindBy(xpath = "//section[@class=\"CartPage_summary__hGo+e\"]/div/span[2]/button/span")
    public WebElement goToCheckOutButton;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"] //input[@id=\"NewAddress_FirstName\"][1]")
    public WebElement fullNameCheckOut;
    @FindBy(xpath = "//select[@id=\"NewAddress_AreaId\"]")
    public WebElement selectGovernCheckOut;
    @FindBy(xpath = "//select[@id=\"NewAddress_AreaId\"] //option[@value=\"1669\"]")
    public WebElement cairoSelection;
    @FindBy(xpath = "//select[@id=\"NewAddress_CityAreaId\"]")
    public WebElement areaSelection;
    @FindBy(xpath = "//select[@id=\"NewAddress_CityAreaId\"] //option[@value=\"1693\"]")
    public WebElement fifthSettlementSelection;
    @FindBy(xpath  = "//div[@class=\"col-lg-12\"] //div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"] /div[7]/input[1]")
    public WebElement emailInput;
    @FindBy(xpath = "//div[@class=\"input-group\"] /input[@name=\"NewAddress.PhoneNumber\"]")
    public WebElement phoneNumberCheckOut;
    @FindBy(xpath = "//div[@style=\"margin-bottom: 20px\"] //input[@name=\"NewAddress.Address1\"][1]")
    public WebElement addressInput;
    @FindBy(xpath = "//div[@class=\"col-lg-12\"] //div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"] /div[11]/input[1]")
    public WebElement address2Input;
    @FindBy(xpath = "//button[@id=\"billingSubmitButton\"]")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@id=\"datepicker\"]/div/div[1]/table/tbody/tr[3]/td[4]")
    public WebElement deliverDateSelection;
    @FindBy(xpath = "//button[@id=\"deliveryAndAssemblyContinue\"]")
    public WebElement deliveryContinueButton;


























}


