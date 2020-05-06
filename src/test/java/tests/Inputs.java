package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs {
    @Test
    public void inputCorrectlyValue () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement field =  driver.findElement(By.xpath("//input[@type='number']"));

        field.sendKeys("10");
        String value = field.getAttribute("value");
        Assert.assertEquals("10", value, "Значение первого значения не совпадает с ожидаемым");

        driver.quit();
    }

    @Test
    public void inputIncorrectlyValue () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement field =  driver.findElement(By.xpath("//input[@type='number']"));

        field.sendKeys("OLGA");
        String value = field.getAttribute("value");
        Assert.assertEquals("", value, "Значение первого значения не совпадает с ожидаемым");

        driver.quit();
    }

    @Test
    public void increaseValue () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement field =  driver.findElement(By.xpath("//input[@type='number']"));

        field.sendKeys("-1");
        field.sendKeys(Keys.ARROW_UP);
        field.sendKeys(Keys.ARROW_UP);
        String value = field.getAttribute("value");
        Assert.assertEquals(value, "1", "Число не соответствует ожидаемому");

        driver.quit();
    }

    @Test
    public void decreaseValue() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement field =  driver.findElement(By.xpath("//input[@type='number']"));

        field.sendKeys("100");
        field.sendKeys(Keys.ARROW_DOWN);
        String value = field.getAttribute("value");
        Assert.assertEquals(value, "99", "Число не соответствует ожидаемому");

        driver.quit();
    }
}




