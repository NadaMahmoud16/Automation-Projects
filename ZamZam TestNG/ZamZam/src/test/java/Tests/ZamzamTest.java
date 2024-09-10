package Tests;

import Pages.ZamzamPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

import static Tests.BaseTest.report;
import static Tests.BaseTest.reportTest;

public class ZamzamTest extends BaseTest {
    ZamzamPage page;
    SoftAssert soft = new SoftAssert();

    @Test
    public void Tc_01() throws InterruptedException {
        reportTest = report.createTest("Footer and search Test");
        ZamzamPage page = new ZamzamPage(driver);

        //Navigate to social media icons
        page.scrollToBottom();

        Thread.sleep(1500);
        page.clickOnFacebookLink();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"), "Facebook Url Contains zamzam");
        driver.close();
        driver.switchTo().window(tabs.get(0));
        reportTest.pass("User can navigate to the Facebook link");

        page.clickOnTwitterLink();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"), "Twitter Url Contains zamzam");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        reportTest.pass("User can navigate to the Twitter link");

        page.clickOnLinkedInLink();
        ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"), "LinkedIn Url Contains zamzam");
        driver.close();
        driver.switchTo().window(tabs3.get(0));
        reportTest.pass("User can navigate to the Linkedin link");

        page.clickOnYoutubeLink();
        ArrayList<String> tabs4 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"), "Youtube Url Contains zamzam");
        driver.close();
        driver.switchTo().window(tabs4.get(0));
        reportTest.pass("User can navigate to the Youtube link");
        reportTest.fail("Zamzam word is not mentioned in the Url");

        page.clickOnInstagramLink();
        ArrayList<String> tabs5 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs5.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"), "Instagram Url Contains zamzam");
        driver.close();
        driver.switchTo().window(tabs5.get(0));
        reportTest.pass("User can navigate to the Instagram link");

        //scroll up to search area
        page.scrollToTop();

        //Search for [makkah-check in/out 1 to 10 oct- 2 rooms - Egypt]
        page.writeOnSelectCityInput();
        page.clickOnMakkahLocator();
        reportTest.pass("User can select any city");
        page.getSelectCityInputText();
        String makkahText = page.getSelectCityInputText();
        soft.assertTrue(true, makkahText);
        reportTest.pass("The selected city should be displayed");

        page.clickOnSelectDated();
        page.clickOnCheckInDay();
        page.clickOnCheckOutDay();
        page.getSelectDated();
        String selectDates = page.getSelectDated();
        soft.assertEquals(selectDates.toLowerCase(), "01-oct-2024 to 10-oct-2024", "Date Not Found");
        reportTest.info("User can select specific dates");
        reportTest.pass("Selected dates are displayed");
        reportTest.fail("Date Text not found");

        page.clickOnRoomsLocator();
        page.clickOnNoOfRooms();
        page.clickOnTwoRoomsLocator();
        page.getRoomsLocatorText();
        String twoRoomsText = page.getRoomsLocatorText();
        soft.assertTrue(true, twoRoomsText);
        reportTest.info("User can select specific number of rooms");
        reportTest.pass("Selected rooms number are displayed");

        page.clickOnNationalityLocator();
        page.clickOnEgyptLocator();
        String egyptText = page.getEgyptLocatorText();
        soft.assertEquals(egyptText.toLowerCase(), "egypt", "Actual and expected results are the same");
        reportTest.info("User can select specific nationality");
        reportTest.pass("Selected nationality is displayed");

        page.getSearchButton();
        page.clickOnSearchButton();
        String searchButtonText = page.getSearchButton();
        soft.assertEquals(searchButtonText.toLowerCase(), "search hotel");
        reportTest.pass("Search button is clickable");
        reportTest.fail("Expected assert is not equal to the actual aseert");

        //Select First Hotel
        page.getFirstHotelLocatorText();
        String firstHotelText = page.getFirstHotelLocatorText();
        soft.assertTrue(firstHotelText.toLowerCase().contains("hotel"));
        page.clickOnFirstHotelLocator();
        reportTest.pass("Clicking on the selected hotel will redirect to another page");

        //Check availability
        page.scrollDown(3800);
        page.getCheckAvailabilityText();
        page.clickOnCheckAvailability();
        String checkText = page.getCheckAvailabilityText();
        soft.assertEquals(checkText.toLowerCase(), "check availability");
        reportTest.pass("Check button is clickable");

        page.getErrorMessageLocator();
        String errorText = page.getErrorMessageLocator();
        System.out.println(" The error message is " + errorText);
        reportTest.fail("User can't check rooms availability");

        soft.assertAll();
    }


}
