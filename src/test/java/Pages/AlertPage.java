package Pages;

import ObjectData.AlertObject;
import loggerUtility.LoggerUtility;
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
        LoggerUtility.infoTest("The user clicks on button alert");

        alertMethods.acceptAlert();
        LoggerUtility.infoTest("The user accepts the alert");
    }

    public void dealWithDelayAlert() {
        elementMethods.clickElement(timerButton);
        LoggerUtility.infoTest("The user clicks on timer Filed");

        alertMethods.acceptAlert();
        LoggerUtility.infoTest("The user accepts the alert");
    }

    public void dealWithPromtButton(AlertObject alertObject) {
        elementMethods.clickElement(prompAlert);
        LoggerUtility.infoTest("The user clicks on buttonFiled element");

        alertMethods.fieldAlert(alertObject.getText());
        LoggerUtility.infoTest("The user fills the alert with following text"+alertObject.getText());

        elementMethods.validateElementText(validare2, "You entered " + alertObject.getText());
        LoggerUtility.infoTest("The user validate element text");
    }

    public void dealWithCancelButton() {
        elementMethods.clickElement(confrmAlert);
        LoggerUtility.infoTest("The user clicks on confrm Alert");

        alertMethods.cancelAlert();
        LoggerUtility.infoTest("The user clicks on cancel alert");

        elementMethods.validateElementText(validare1, "You selected Cancel");
        LoggerUtility.infoTest("The user validates the cancel message");
    }
}
