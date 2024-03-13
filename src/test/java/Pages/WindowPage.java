package Pages;

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
        windowMethods.switchSpecificWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificWindow(0);
    }

    public void interactWithNewWindow() {
        elementMethods.clickElement(newWindowButton);
        windowMethods.switchSpecificWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificWindow(0);
    }
}
