import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {

    @Test
    public void verifyCheckbox () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement element = driver.findElement(By.xpath("//body//input[1]"));

        Assert.assertFalse(element.isSelected(), "Checkbox 1 уже выбран");
        element.click();
        Assert.assertTrue(element.isSelected(), "Checkbox 1 не был выбран");

        WebElement element2 = driver.findElement(By.xpath("//body//input[2]"));
        Assert.assertTrue(element2.isSelected(), "Checkbox 2 не выбран по умолчанию");
        element2.click();
        Assert.assertFalse(element2.isSelected(), "Checkbox 2 не был снят");

        driver.quit();
    }
}