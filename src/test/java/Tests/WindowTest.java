package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import Pages.WindowPage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends ShareData {


    @Test
    public void windowMethod() {

        WindowMethods windowMethods = new WindowMethods(getGetWebDriver());

        HomePage homePage = new HomePage(getGetWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getGetWebDriver());
        alertWindowFramePage.navigateToWindowPage();

        WindowPage windowPage = new WindowPage(getGetWebDriver());
        windowPage.interactWithTabBrowser();
        windowPage.interactWithNewWindow();

    }
}
