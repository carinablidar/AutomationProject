package ShareData;

import loggerUtility.LoggerUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends ShareData{

    private String testName;

    @BeforeMethod
    public void prepareEnvironment() {
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName);
        prepareDriver();
        LoggerUtility.infoTest("The driver is open with success");
    }

    @AfterMethod
    public void clearEnvironment() {
        clearDriver();
        LoggerUtility.infoTest("The driver is close with success");
        LoggerUtility.finishTestCase(testName);
    }
}
