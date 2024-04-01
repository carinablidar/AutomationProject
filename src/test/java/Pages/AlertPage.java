package Pages;

import ObjectData.AlertObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "alertButton")
    private WebElement buttonAlerts;

    @FindBy(id = "timerAlertButton")
    private WebElement timerButton;

    @FindBy(id = "promtButton")
    private WebElement prompAlert;

    @FindBy(id = "confirmButton")
    private WebElement confrmAlert;

    @FindBy(id = "promptResult")
    private WebElement validare2;

    @FindBy(id = "confirmResult")
    private WebElement validare1;

    public void dealWithAcceptAlert() {
        elementMethods.clickElement(buttonAlerts);
        alertMethods.acceptAlert();
    }

    public void dealWithDelayAlert() {
        elementMethods.clickElement(timerButton);
        alertMethods.acceptAlert();
    }

    public void dealWithPromtButton(AlertObject alertObject) {
        elementMethods.clickElement(prompAlert);
        alertMethods.fieldAlert(alertObject.getText());
        elementMethods.validateElementText(validare2, "You entered " + alertObject.getText());
    }

    public void dealWithCancelButton() {
        elementMethods.clickElement(confrmAlert);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(validare1, "You selected Cancel");
    }
}
