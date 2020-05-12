package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ContextMenuPage extends BasePage {

    private static final String CONTEXT_MENU_PAGE_URL = "http://the-internet.herokuapp.com/context_menu";
    private static final By BOX_ELEMENT = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(CONTEXT_MENU_PAGE_URL);
    }

    public void rightClick() {
        WebElement rightClickAction = driver.findElement(BOX_ELEMENT);
        actions.contextClick(rightClickAction).build().perform();
    }

    public void verifyAlertMessage(String messageToVerify) {
        String actualMessageToVerify = driver.switchTo().alert().getText();
        Assert.assertEquals(actualMessageToVerify, messageToVerify, "Сообщение в алерте некорректное");
    }
}