package Pages;

import ObjectData.WebTableObject;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{
    public WebTablePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;

    @FindBy(id = "firstName")
    private WebElement firstField;

    @FindBy(id = "lastName")
    private WebElement secondField;

    @FindBy(id = "userEmail")
    private WebElement thirdField;

    @FindBy(id = "age")
    private WebElement forthField;

    @FindBy(id = "salary")
    private WebElement fifthField;

    @FindBy(id = "department")
    private  WebElement sixthField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "delete-record-4")
    private  WebElement deleteButton;

    @FindBy(id = "edit-record-4")
    private WebElement editField;

    public void addNewEntry(WebTableObject webTableObject) {

        addButton.click();
        elementMethods.refillElement(firstField, webTableObject.getFirstnameValue());
        LoggerUtility.infoTest("The user add first name value");

        elementMethods.refillElement(secondField, webTableObject.getLastnameValue());
        LoggerUtility.infoTest("The user add last name value");

        elementMethods.refillElement(thirdField, webTableObject.getEmailValue());
        LoggerUtility.infoTest("The user add email value");

        elementMethods.refillElement(forthField, webTableObject.getAgeValue());
        LoggerUtility.infoTest("The user add age value");

        elementMethods.refillElement(fifthField, webTableObject.getSalaryValue());
        LoggerUtility.infoTest("The user add salary value");

        elementMethods.refillElement(sixthField, webTableObject.getDepartamentValue());
        LoggerUtility.infoTest("The user add department value");

        elementMethods.clickElement(submitButton);
        LoggerUtility.infoTest("The user click on submit button");
    }

    public void editEntry(WebTableObject webTableObject) {
        elementMethods.clickElement(editField);
        LoggerUtility.infoTest("The user clicks on edit field");

        elementMethods.refillElement(firstField, webTableObject.getFirstnameModifyValue());
        LoggerUtility.infoTest("The user edit first name value");

        elementMethods.refillElement(forthField, webTableObject.getAgeModifyValue());
        LoggerUtility.infoTest("The user edit age value");

        elementMethods.clickElement(submitButton);
        LoggerUtility.infoTest("The user click on submit button");
    }

    public void deleteButton() {
        elementMethods.clickElement(deleteButton);
        LoggerUtility.infoTest("The user click on delete button");
    }
}
