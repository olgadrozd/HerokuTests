package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {

    @Test
    public void checkDropdown () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        String textOption1 = select.getFirstSelectedOption().getText();
        Assert.assertEquals(textOption1, "Option 1", "Option 1 не был выбран");

        select.selectByVisibleText("Option 2");
        String textOption2 = select.getFirstSelectedOption().getText();
        Assert.assertEquals(textOption2, "Option 2", "Option 2 не был выбран");

        driver.quit();
    }
}
