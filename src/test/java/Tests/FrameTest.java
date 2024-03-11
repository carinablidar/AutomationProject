package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import Pages.AlertWindowFramePage;
import Pages.FramePage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest extends ShareData {



    @Test
    public void frameMethod() {

        HomePage homePage = new HomePage(getGetWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getGetWebDriver());
        alertWindowFramePage.navigateToFramePage();

        FramePage framePage = new FramePage(getGetWebDriver());
        framePage.dealWithFrame();
    }
}
