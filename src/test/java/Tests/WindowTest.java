package Tests;

import HelperMethods.WindowMethods;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import Pages.WindowPage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {


    @Test
    public void windowMethod() {

        HomePage homePage = new HomePage(getGetWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getGetWebDriver());
        alertWindowFramePage.navigateToWindowPage();

        WindowPage windowPage = new WindowPage(getGetWebDriver());
        windowPage.interactWithTabBrowser();
        windowPage.interactWithNewWindow();

    }
}
