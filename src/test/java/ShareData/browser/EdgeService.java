package ShareData.browser;

import ProertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.Map;

public class EdgeService implements BrowserService{

    private WebDriver webDriver;
    @Override
    public void openBrowser(Map<String, String> testData) {

        //aceasta metoda are ca scop sa deschida un chrome cu configrarile noastre
        PropertyUtility propertyUtility = new PropertyUtility("atfData");

        EdgeOptions options = (EdgeOptions) getBrowserOptions(propertyUtility.getAllData());
        webDriver = new EdgeDriver(options);
        webDriver = new EdgeDriver();
        webDriver.get(propertyUtility.getAllData().get("url"));
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Override
    public Object getBrowserOptions(Map<String, String> testData) {

        //configuram obtiunile pentru browserul nostru
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments(testData.get("gpu"));
        edgeOptions.addArguments(testData.get("infobars"));
        edgeOptions.addArguments(testData.get("extensions"));
        edgeOptions.addArguments(testData.get("sandbox"));
        if(!testData.get("headless").isEmpty()) {
            edgeOptions.addArguments(testData.get("headless"));
        }
        return edgeOptions;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
