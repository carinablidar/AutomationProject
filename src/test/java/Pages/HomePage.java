package Pages;

import HelperMethods.ElementMethods;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(className = "fc-button-label")
    private WebElement consentField;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement windowField;


    public void navigateToAlertFrameWindowPage() {
        elementMethods.ScrollElementByPixel(0,450);
        elementMethods.clickElement(consentField);
        elementMethods.clickElement(windowField);
    }

}
