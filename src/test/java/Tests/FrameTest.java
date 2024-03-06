package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
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

        ElementMethods elementMethods = new ElementMethods(getGetWebDriver());
        FrameMethods frameMethods = new FrameMethods(getGetWebDriver());


        //facem scroll la pagina
        elementMethods.ScrollElementByPixel(0, 450);

        //identificam un element dupa clasa
        WebElement consentField = getGetWebDriver().findElement(By.className("fc-button-label")); //pui valoarea clasei din site, cu inspect element
        elementMethods.clickElement(consentField);

        WebElement windowField = getGetWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(windowField);

        elementMethods.ScrollElementByPixel(0, 450);

        WebElement frameField = getGetWebDriver().findElement(By.xpath("//span[text()='Frames']"));
        elementMethods.clickElement(frameField);



        //interactionam cu un iframe

        frameMethods.switchSpecificIFrame("frame1");
        WebElement frame1Element = getGetWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElemetText(frame1Element);

        //specificam sa revina la framul curent
        frameMethods.switchParentFrame();

        frameMethods.switchSpecificIFrame("frame2");
        WebElement frame2Element = getGetWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElemetText(frame2Element);

    }
}
