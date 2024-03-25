package Pages;

import ObjectData.WebTableObject;
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
        elementMethods.refillElement(secondField, webTableObject.getLastnameValue());
        elementMethods.refillElement(thirdField, webTableObject.getEmailValue());
        elementMethods.refillElement(forthField, webTableObject.getAgeValue());
        elementMethods.refillElement(fifthField, webTableObject.getSalaryValue());
        elementMethods.refillElement(sixthField, webTableObject.getDepartamentValue());
        elementMethods.clickElement(submitButton);
    }

    public void editEntry(WebTableObject webTableObject) {
        elementMethods.clickElement(editField);
        elementMethods.refillElement(firstField, webTableObject.getFirstnameModifyValue());
        elementMethods.refillElement(forthField, webTableObject.getAgeModifyValue());
        elementMethods.clickElement(submitButton);
    }

    public void deleteButton() {
        elementMethods.clickElement(deleteButton);
    }
}
