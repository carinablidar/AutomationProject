package Pages;

import HelperMethods.ElementMethods;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertWindowFramePage extends BasePage {

    public AlertWindowFramePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertField;

    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement frameField;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    public  WebElement browserWindowField;

    public void navigateToAlertPage() {
        elementMethods.ScrollElementByPixel(0,350);
        LoggerUtility.infoTest("The user scroll down the page");
        elementMethods.clickElement(alertField);
        LoggerUtility.infoTest("The user clicks on alertFiled element");
    }

    public void navigateToFramePage() {
        elementMethods.clickElement(frameField);
        LoggerUtility.infoTest("The user clicks on frameFiled element");
    }

    public void navigateToWindowPage() {
        elementMethods.clickElement(browserWindowField);
        LoggerUtility.infoTest("The user clicks on browserWindowField element");
    }
}
