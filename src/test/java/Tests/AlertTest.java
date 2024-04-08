package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import ProertyUtility.PropertyUtility;
import ShareData.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AlertTest extends Hooks {


    @Test
    public void alertMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("AlertData");
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getGetWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getGetWebDriver());
        alertWindowFramePage.navigateToAlertPage();

        //alertele:

        AlertPage alertPage = new AlertPage(getGetWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromtButton(alertObject);
        alertPage.dealWithCancelButton();
    }
}