package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{
    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = "//span[text()='Web Tables']")
    public WebElement webTablesField;

    public void navigateToWebTable() {
        webTablesField.click();
    }




}
