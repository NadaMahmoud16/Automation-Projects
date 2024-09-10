package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZamzamPage extends BasePage {

    public ZamzamPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By facebookLink = By.id("linkFacebook");
    By twitterLink =  By.id("linkTwitter");
    By linkedinLink = By.id("linkLinkedin");
    By youtubeLink = By.id("linkYoutube");
    By instagramLink = By.id("linkInstagram");
    By selectCityInput = By.id("HotelCity");
    By makkahLocator = By.xpath("//b[normalize-space()='Makkah / Mecca']");
    By selectDated = By.id("hotelStayDates");
    By checkInDay = By.xpath("//div[@class=\"flatpickr-days\"] //div[@class=\"dayContainer\"][2] //span[@class=\"flatpickr-day\"][1]");
    By checkOutDay = By.xpath("//div[@class=\"flatpickr-days\"] //div[@class=\"dayContainer\"][2] //span[@class=\"flatpickr-day\"][9]");
    By roomsLocator = By.id("paxAndRoomDetail");
    By noOfRooms = By.xpath("//div[@id=\"pass_form\"]/div[1]/div[2]/div/select");
    By twoRoomsLocator = By.xpath("//div[@id=\"pass_form\"]/div[1]/div[2]/div/select/option[2]");
    By nationalityLocator = By.id("searchNationality");
    By egyptLocator = By.xpath("//select[@id=\"searchNationality\"]//option[@value=\"EG\"]");
    By searchButton = By.xpath("//span[@class=\"content\"]");
    By firstHotelLocator = By.xpath("//div[@id=\"resultBox-1067450\"]//span[@id=\"linkHotelDetails\"]");
    By checkAvailability = By.cssSelector("button[id=\"checkAvailabilityBtn\"] span[class=\"content\"]");
    By errorMessageLocator = By.cssSelector("h5[class=\"pt-3 pb-3\"]");

    //Methods
    public void clickOnFacebookLink (){click(facebookLink);}
    public void clickOnTwitterLink (){click(twitterLink);}
    public void clickOnLinkedInLink (){click(linkedinLink);}
    public void clickOnYoutubeLink (){click(youtubeLink);}
    public void clickOnInstagramLink (){click(instagramLink);}
    public void writeOnSelectCityInput(){write(selectCityInput, "makkah");}
    public void clickOnMakkahLocator (){click(makkahLocator);}
    public String getSelectCityInputText(){return returnText(selectCityInput);}
    public void clickOnSelectDated(){click(selectDated);}
    public void clickOnCheckInDay(){click(checkInDay);}
    public void clickOnCheckOutDay(){click(checkOutDay);}
    public String getSelectDated(){return returnText(selectDated);}
    public void clickOnRoomsLocator(){click(roomsLocator);}
    public void clickOnNoOfRooms (){click(noOfRooms);}
    public void clickOnTwoRoomsLocator (){click(twoRoomsLocator);}
    public String getRoomsLocatorText(){return returnText(roomsLocator);}
    public void clickOnNationalityLocator (){click(nationalityLocator);}
    public void clickOnEgyptLocator (){click(egyptLocator);}
    public String getEgyptLocatorText (){return returnText(egyptLocator);}
    public void clickOnSearchButton (){click(searchButton);}
    public String getSearchButton (){return returnText(searchButton);}
    public String getFirstHotelLocatorText (){return returnText(firstHotelLocator);}
    public void clickOnFirstHotelLocator (){click(firstHotelLocator);}
    public void clickOnCheckAvailability(){click(checkAvailability);}
    public String getCheckAvailabilityText (){return returnText(checkAvailability);}
    public String getErrorMessageLocator (){return returnText(errorMessageLocator);}





}
