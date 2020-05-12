package tests;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test
    public void verifyJSAlert() {
        alertPage.openPage();
        alertPage.clickJSAlert();
        alertPage.validateJSAlert("You successfuly clicked an alert");
    }

    @Test
    public void verifyJSConfirmAlert() {
        alertPage.openPage();
        alertPage.clickJSConfirmAlert();
        alertPage.validateJSConfirmAlert("You clicked: Ok");
    }

    @Test
    public void verifyJSPromptAlert() {
        alertPage.openPage();
        alertPage.clickJSPromptAlert();
        alertPage.validateJSPromptAlert("Hello", "You entered: Hello");
    }
}