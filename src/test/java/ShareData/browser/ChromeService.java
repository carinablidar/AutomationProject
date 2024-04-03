package ShareData.browser;

import ProertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Map;

public class ChromeService implements BrowserService{

    private WebDriver webDriver;
    @Override
    public void openBrowser(Map<String, String> testData) {

        //aceasta metoda are ca scop sa deschida un chrome cu configrarile noastre

        ChromeOptions options = (ChromeOptions) getBrowserOptions(testData);
        webDriver = new ChromeDriver(options);
        webDriver = new ChromeDriver();
        webDriver.get(testData.get("url"));
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Override
    public Object getBrowserOptions(Map<String, String> testData) {

        //configuram obtiunile pentru browserul nostru
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(testData.get("gpu"));
        chromeOptions.addArguments(testData.get("infobars"));
        chromeOptions.addArguments(testData.get("extensions"));
        chromeOptions.addArguments(testData.get("sandbox"));
        if(!testData.get("headless").isEmpty()) {
            chromeOptions.addArguments(testData.get("headless"));
        }
        return chromeOptions;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
