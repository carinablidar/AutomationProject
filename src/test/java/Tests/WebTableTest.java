package Tests;

import HelperMethods.ElementMethods;
import ObjectData.WebTableObject;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablePage;
import ProertyUtility.PropertyUtility;
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

        PropertyUtility propertyUtility = new PropertyUtility("WebTableData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getGetWebDriver());
        homePage.navigateToElemetsPage();

        ElementsPage elementsPage = new ElementsPage(getGetWebDriver());
        elementsPage.navigateToWebTable();

        WebTablePage webTablePage = new WebTablePage(getGetWebDriver());
        webTablePage.addNewEntry(webTableObject);
        webTablePage.editEntry(webTableObject);
        webTablePage.deleteButton();
    }
}