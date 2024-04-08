package Tests;

import Pages.AlertWindowFramePage;
import Pages.FramePage;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {



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
