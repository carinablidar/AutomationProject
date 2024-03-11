package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementMethods {
    private WebDriver webDriver;

    public ElementMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void ScrollElementByPixel(Integer x, Integer y) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy("+x+", "+y+")");
    }


    public void waitVisibleEl(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        waitVisibleEl(element);
        element.click();
    }

    public void validateElementText(WebElement element, String expected) {
        waitVisibleEl(element);
        String actual = element.getText();
        Assert.assertEquals(actual, expected);
    }

    public void printElemetText(WebElement element) {
        waitVisibleEl(element);
        System.out.println(element.getText());
    }

    public void filledElement(WebElement element, String value) {
        waitVisibleEl(element);
        element.sendKeys(value);
    }

    public void refillElement(WebElement element, String value) {
        waitVisibleEl(element);
        element.clear();
        element.sendKeys(value);
    }

    public void selectTextElement(WebElement element, String value) {
        waitVisibleEl(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectValueElement(WebElement element, String value) {
        waitVisibleEl(element);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void fillPressElement(WebElement element, String value, Keys key) {
        waitVisibleEl(element);
        element.sendKeys(value);
        element.sendKeys(key);
    }

    public void clickElemForce (WebElement element){
        waitVisibleEl(element);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();",element);
    }


    public void clickElemForce2(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();",element);
    }

}


