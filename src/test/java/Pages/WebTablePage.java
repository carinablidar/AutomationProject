package Pages;

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

    public void addNewEntry(String firstnameValue, String lastnameValue, String emailValue,
                            String ageValue,  String salaryValue, String departamentValue) {

        addButton.click();
        elementMethods.refillElement(firstField, firstnameValue);
        elementMethods.refillElement(secondField, lastnameValue);
        elementMethods.refillElement(thirdField, emailValue);
        elementMethods.refillElement(forthField, ageValue);
        elementMethods.refillElement(fifthField, salaryValue);
        elementMethods.refillElement(sixthField, departamentValue);
        elementMethods.clickElement(submitButton);
    }

    public void editEntry(String firstnameModifyValue,  String ageModifyValue) {
        elementMethods.clickElement(editField);
        elementMethods.refillElement(firstField, firstnameModifyValue);
        elementMethods.refillElement(forthField, ageModifyValue);
        elementMethods.clickElement(submitButton);
    }

    public void deleteButton() {
        elementMethods.clickElement(deleteButton);
    }
}
