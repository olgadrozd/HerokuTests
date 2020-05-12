package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AddRemoveElements {

    @Test
    public void addElements () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        element.click();
        element.click();

        WebElement element2 = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        element2.click();
        int countOfElements = driver.findElements(By.xpath("//button[contains(text(),'Delete')]")).size();
        Assert.assertEquals(countOfElements, 1, "Кол-во элементов не равно 1");

        driver.quit();
    }
}
















