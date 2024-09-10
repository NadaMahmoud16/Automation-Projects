package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected static ExtentReports report;
    protected static ExtentTest reportTest;

    @BeforeSuite
    public void beforeSuite(){
        report = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(new File("Reports/report.html"));
        report.attachReporter(spark);
    }
    @BeforeTest
    public void beforeTest() throws InterruptedException {
//        ChromeOptions options = new ChromeOptions();
//        options.addExtensions(new File("src/main/resources/GIGHMMPIOBKLFEPJOCNAMGKKBIGLIDOM_6_8_0_0.crx"));

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://zamzam.com/");
//        WebDriverWait wait;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        driver.close();
//        driver.switchTo().window(tabs.get(0));
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @AfterSuite
    public void afterSuit() throws IOException {
        report.flush();
        Desktop.getDesktop().open(new File("Reports/report.html"));
    }
}
