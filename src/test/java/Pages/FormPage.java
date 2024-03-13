package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends  BasePage{
    public FormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement webTablesField;

    public void navigateToPracticeForm() {
        elementMethods.clickElement(webTablesField);
    }
}
