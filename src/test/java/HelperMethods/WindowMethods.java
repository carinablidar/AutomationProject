package HelperMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    private WebDriver webDriver;

    public WindowMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void switchSpecificWindow(Integer index) {

        List<String> tabsOpen = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabsOpen.get(index));
        System.out.println("Tabul curent are URL " + webDriver.getCurrentUrl());
    }

    public void closeCurrentWindow() {
        webDriver.close();
    }
}
