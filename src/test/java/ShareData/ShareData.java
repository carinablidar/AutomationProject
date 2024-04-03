package ShareData;

import ShareData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {

    private WebDriver getWebDriver;

    @BeforeMethod
    public void prepareDriver() {

        getWebDriver = new BrowserFactory().getBrowserInstance();
    }

    @AfterMethod
    public void clearDriver() {

        getWebDriver.quit();

    }

    public WebDriver getGetWebDriver() {
        return getWebDriver;
    }
}


