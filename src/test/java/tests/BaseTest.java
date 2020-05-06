package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AlertPage;
import pages.ContextMenuPage;
import pages.FileUploadPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    FileUploadPage fileUploadPage;
    ContextMenuPage contextMenuPage;
    pages.AlertPage alertPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fileUploadPage = new FileUploadPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
        alertPage = new AlertPage(driver);
    }

    @AfterMethod(alwaysRun=true)
    public void closeBrowser() {
        driver.quit();
    }
}