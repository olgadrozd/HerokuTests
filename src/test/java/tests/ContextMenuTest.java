package tests;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void verifyRightClick() {
        contextMenuPage.openPage();
        contextMenuPage.verifyAlertClick();
        contextMenuPage.verifyAlertMessage("You selected a context menu");
    }
}