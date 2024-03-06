package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
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
        ElementMethods elementMethods = new ElementMethods(getGetWebDriver());
        WindowMethods windowMethods = new WindowMethods(getGetWebDriver());

        elementMethods.ScrollElementByPixel(0,450);



        //identificam un element dupa clasa
        WebElement consentField = getGetWebDriver().findElement(By.className("fc-button-label")); //pui valoarea clasei din site, cu inspect element
        elementMethods.clickElement(consentField);


        WebElement windowField = getGetWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(windowField);

        elementMethods.ScrollElementByPixel(0,450);

        WebElement browserWindowField = getGetWebDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
        elementMethods.clickElement(browserWindowField);

        WebElement newTabButton = getGetWebDriver().findElement(By.id("tabButton"));
        elementMethods.clickElement(newTabButton);


        //trebuie sa identificam nr de tab-uri deschise
        windowMethods.switchSpecificWindow(1);

        //inchidem tab curent = close
        //inchidm browser = quit
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificWindow(0);


        WebElement newWindowButton = getGetWebDriver().findElement(By.id("windowButton"));
        elementMethods.clickElement(newWindowButton);
        windowMethods.switchSpecificWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificWindow(0);

    }
}
