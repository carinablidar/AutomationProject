package Pages;

import HelperMethods.ElementMethods;
import com.google.j2objc.annotations.Weak;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

//    @FindBy(className = "fc-button-label")
//    private WebElement consentField;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement windowField;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement elementsField;

    @FindBy(xpath = "//h5[text()='Elements']")
    private  WebElement elementField;




    public void navigateToAlertFrameWindowPage() {
        elementMethods.ScrollElementByPixel(0,450);
        LoggerUtility.infoTest("The user scroll down the page");

        elementMethods.clickElement(windowField);
        LoggerUtility.infoTest("The user clicks on windowFiled element");
    }

    public void navigateToFormsPage() {
        elementMethods.ScrollElementByPixel(0,450);
        LoggerUtility.infoTest("The user scroll down the page");

        elementMethods.clickElement(elementsField);
        LoggerUtility.infoTest("The user clicks on windowFiled element");
    }

    public void navigateToElemetsPage() {
        elementMethods.ScrollElementByPixel(0,450);
        LoggerUtility.infoTest("The user scroll down the page");

        elementMethods.clickElement(elementField);
        LoggerUtility.infoTest("The user clicks on windowFiled element");
    }

}
