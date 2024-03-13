package Tests;

import HelperMethods.ElementMethods;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablePage;
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

        HomePage homePage = new HomePage(getGetWebDriver());
        homePage.navigateToElemetsPage();

       ElementsPage elementsPage = new ElementsPage(getGetWebDriver());
       elementsPage.navigateToWebTable();


        String firstnameValue="Carina";
        String lastnameValue="Blidar";
        String emailValue="blidar.carina@yahoo.com";
        String ageValue="28";
        String salaryValue="50";
        String departamentValue="IT";
        String firstnameModifyValue = "Roxana";
        String ageModifyValue="25";

        WebTablePage webTablePage = new WebTablePage(getGetWebDriver());
        webTablePage.addNewEntry(firstnameValue, lastnameValue, emailValue,ageValue, salaryValue,departamentValue);
        webTablePage.editEntry(firstnameModifyValue, ageModifyValue);
        webTablePage.deleteButton();
    }
}
