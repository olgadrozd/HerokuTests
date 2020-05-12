package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Typos {

    @Test
    public void checkFirstParagraph () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");

        String text1 = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(text1, "This example demonstrates a typo being introduced. It does it randomly on each page load.", "Текст в первом параграфе содержит орфографические ошибки");

        driver.quit();
    }

    @Test
    public void checkSecondParagraph () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");

        List<WebElement> list = driver.findElements(By.tagName("p"));
        WebElement secondparagraph = list.get(1);
        String actualText = secondparagraph.getText();
        Assert.assertEquals(actualText, "Sometimes you'll see a typo, other times you won't.", "Текст во втором параграфе содержит орфографические ошибки");

        driver.quit();
    }
}
