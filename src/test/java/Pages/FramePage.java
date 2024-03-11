package Pages;

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
        System.out.println(frameElement.getText());
        frameMethods.switchParentFrame();

        frameMethods.switchSpecificIFrame("frame2");
        System.out.println(frameElement.getText());
    }
}
