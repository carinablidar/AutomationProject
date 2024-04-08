package Pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    public void interactWithTabBrowser() {
        elementMethods.clickElement(newTabButton);
        LoggerUtility.infoTest("The user clicks on new tab button");

        windowMethods.switchSpecificWindow(1);
        LoggerUtility.infoTest("The user switch to a tab with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtility.infoTest("The user clouse the current tab");

        windowMethods.switchSpecificWindow(0);
        LoggerUtility.infoTest("The user switch to a tab with index 0");
    }

    public void interactWithNewWindow() {
        elementMethods.clickElement(newWindowButton);
        LoggerUtility.infoTest("The user clicks on new window button");

        windowMethods.switchSpecificWindow(1);
        LoggerUtility.infoTest("The user switch to a window with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtility.infoTest("The user clouse the current tab");

        windowMethods.switchSpecificWindow(0);
        LoggerUtility.infoTest("The user switch to a window with index 0");
    }
}
