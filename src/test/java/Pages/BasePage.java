package Pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public ElementMethods elementMethods;
    public WebDriver webDriver;
    public AlertMethods alertMethods;
    public FrameMethods frameMethods;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        elementMethods = new ElementMethods(webDriver);
        alertMethods = new AlertMethods(webDriver);
        frameMethods = new FrameMethods(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}