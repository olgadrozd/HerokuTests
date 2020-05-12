package tests;
import org.testng.annotations.Test;
import java.io.File;

public class UploadTest extends BaseTest {
    private static final String UPLOAD_FILE_PATH = "src/test/resources/FileForUpload";
    private static final File UPLOAD_ABSOLUTE_PATH = new File(UPLOAD_FILE_PATH);

    @Test
    public void verifyUploadFile() {
        fileUploadPage.openPage();
        fileUploadPage.validateFileUpload(UPLOAD_ABSOLUTE_PATH.getAbsolutePath());
        fileUploadPage.validateUploadedFileLink();
    }
}