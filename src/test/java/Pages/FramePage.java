package Pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {


    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "sampleHeading")
    public WebElement frameElement;

    public void dealWithFrame() {
        frameMethods.switchSpecificIFrame("frame1");
        LoggerUtility.infoTest("The user switch to a specific Iframe");

        System.out.println(frameElement.getText());
        LoggerUtility.infoTest("The user interacts with the text of frameElement");

        frameMethods.switchParentFrame();
        LoggerUtility.infoTest("The user switch to default frame");

        frameMethods.switchSpecificIFrame("frame2");
        LoggerUtility.infoTest("The user switch to a specific Iframe");

        System.out.println(frameElement.getText());
        LoggerUtility.infoTest("The user interacts with the text of frameElement");
    }
}
