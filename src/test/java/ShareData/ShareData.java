package ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {

    private WebDriver getWebDriver;

    @BeforeMethod
    public void prepareDriver() {

        //deschide un browser de Chrome
        getWebDriver = new ChromeDriver();

        //accesam un URL
        getWebDriver.get("https://demoqa.com/");

        //maximizare fereastra
        getWebDriver.manage().window().maximize();

        //wait implicit
        getWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void clearDriver() {

        getWebDriver.quit();

    }

    public WebDriver getGetWebDriver() {
        return getWebDriver;
    }
}

//tema sa modificam peste tot unde e webDriver = getWebDriver si private webdriver
