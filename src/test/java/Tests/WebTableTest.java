package Tests;

import HelperMethods.ElementMethods;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest extends ShareData {



    @Test
    public void metodaTest() {
        ElementMethods elementMethods = new ElementMethods(getGetWebDriver());


        //facem scroll la pagina
        JavascriptExecutor js = (JavascriptExecutor) getGetWebDriver();
        js.executeScript("window.scrollBy(0,450)", "");

        //identificam un element dupa clasa
        WebElement consentField = getGetWebDriver().findElement(By.className("fc-button-label")); //pui valoarea clasei din site, cu inspect element
        consentField.click();

        //identificam un element dupa xpath
        WebElement elementsField = getGetWebDriver().findElement(By.xpath("//h5[text()='Elements']"));
        elementsField.click();

        //mai putem un scroll
        js.executeScript("window.scrollBy(0,350)", "");

        WebElement webTablesField = getGetWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesField.click();

        //identificam un element dupa id
        WebElement addButton = getGetWebDriver().findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement firstField = getGetWebDriver().findElement(By.id("firstName"));
        String firstnameValue="Carina";
        elementMethods.refillElement(firstField, firstnameValue);


        WebElement secondField = getGetWebDriver().findElement(By.id("lastName"));
        String lastnameValue="Blidar";
        elementMethods.refillElement(secondField, lastnameValue);


        WebElement thirdField = getGetWebDriver().findElement(By.id("userEmail"));
        String emailValue="blidar.carina@yahoo.com";
        elementMethods.refillElement(thirdField, emailValue);

        WebElement forthField = getGetWebDriver().findElement(By.id("age"));
        String ageValue="28";
        elementMethods.refillElement(forthField, ageValue);

        WebElement fifthField = getGetWebDriver().findElement(By.id("salary"));
        String salaryValue="50";
        elementMethods.refillElement(fifthField, salaryValue);

        WebElement sixthField = getGetWebDriver().findElement(By.id("department"));
        String departamentValue="IT";
        elementMethods.refillElement(sixthField, departamentValue);

        WebElement submitButton = getGetWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitButton);

        //modificam entry adaugat mai sus
        WebElement editField = getGetWebDriver().findElement(By.id("edit-record-4"));
        editField.click();

        WebElement firstFieldModified = getGetWebDriver().findElement(By.id("firstName"));
        String firstnameModifyValue="Roxana";
        firstFieldModified.clear();
        firstFieldModified.sendKeys(firstnameModifyValue);

        WebElement forthModifyField = getGetWebDriver().findElement(By.id("age"));
        String ageModifyValue="25";
        forthModifyField.clear();
        forthModifyField.sendKeys(ageModifyValue);

        WebElement submitModifyButton = getGetWebDriver().findElement(By.id("submit"));
        submitModifyButton.click();

        //stergem noul entry
        WebElement deleteButton = getGetWebDriver().findElement(By.id("delete-record-4"));
        deleteButton.click();

        //inchidem browser = quit
        //inchidem tab = close
        //webDriver.quit();

    }
}
