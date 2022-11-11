package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import utils.LoggerUtils;
import utils.WebDriverUtils;

public class BaseTest extends LoggerUtils {

    private final String sTestName = this.getClass().getName();
    private WebDriver driver;


    protected WebDriver setUpDriver() {

        return driver = WebDriverUtils.setupDriver();
    }


    @BeforeMethod
    public void setupTest(ITestContext testContext) {
        log.debug("[SETUP TEST] " + sTestName);
        driver = setUpDriver();
    }


}
