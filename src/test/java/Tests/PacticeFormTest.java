package Tests;

import HelperMethods.ElementMethods;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class PacticeFormTest extends ShareData {



    @Test
    public void metodaTest() {

        ElementMethods elementMethods = new ElementMethods(getGetWebDriver());


        //facem scroll la pagina
        JavascriptExecutor js = (JavascriptExecutor) getGetWebDriver();
        js.executeScript("window.scrollBy(0,450)", "");

        //identificam un element dupa clasa
        WebElement consentField = getGetWebDriver().findElement(By.className("fc-button-label")); //pui valoarea clasei din site, cu inspect element
        consentField.click();

        WebElement elementsField = getGetWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
        elementsField.click();

        //mai putem un scroll
        js.executeScript("window.scrollBy(0,350)", "");

        WebElement webTablesField = getGetWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        webTablesField.click();

        WebElement firstNameField = getGetWebDriver().findElement(By.id("firstName"));
        String firstNameValue="Carina";
        elementMethods.filledElement(firstNameField, firstNameValue);

        //identificam un element dupa css
        WebElement lastNameField = getGetWebDriver().findElement(By.cssSelector("input[placeholder='Last Name"));
        String lastNameValue="Blidar";
        elementMethods.filledElement(lastNameField, lastNameValue);

        WebElement emailField = getGetWebDriver().findElement(By.cssSelector("input[placeholder='name@example.com"));
        String emailValue="blidar.carina@yahoo.com";
        elementMethods.filledElement(emailField, emailValue);

        WebElement numarField = getGetWebDriver().findElement(By.cssSelector("input[placeholder='Mobile Number"));
        String numarValue="0745845691";
        elementMethods.filledElement(numarField, numarValue);


        //dupa calendar
        WebElement dateOfBirthField = getGetWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
        dateOfBirthField.click();

       //dupa drop down calendar
        WebElement monthDateOfBirth = getGetWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
        String monthValue = "May";
        elementMethods.selectTextElement(monthDateOfBirth, monthValue);


        WebElement yearDateOfBirth = getGetWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
        String yearValue = "1995";
        elementMethods.selectValueElement(yearDateOfBirth, yearValue);


        List<WebElement> dayDateOfBirthFields = getGetWebDriver().findElements(By.xpath("//div[not(contains(@class, 'outside-month')) and contains(@class, 'react-datepicker__day react-datepicker__day')]"));
        String dayValue = "17";

        for (Integer i = 0; i < dayDateOfBirthFields.size(); i++) {
            if (dayDateOfBirthFields.get(i).getText().equals(dayValue)) {
                dayDateOfBirthFields.get(i).click();
                break;
            }
        }


        String genderValue = "Female";
        genderFiled(genderValue);



        js.executeScript("window.scrollBy(0,350)", "");

        //facem un algoritm care sa imi afiseze val pe care i le specific
        List<String> hobbies = Arrays.asList("Sports", "Music", "Reading");
        List<WebElement> hobbiesLabelsList = getGetWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));


        for (int i = 0; i < hobbiesLabelsList.size(); i++) {
            String currentElementText = hobbiesLabelsList.get(i).getText();
            if (hobbies.contains(currentElementText)) {
                new WebDriverWait(getGetWebDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(hobbiesLabelsList.get(i))).click();
            }
        }


        String subjectsValue = "Economics";
        WebElement subjectsField = getGetWebDriver().findElement(By.id("subjectsInput"));
        elementMethods.fillPressElement(subjectsField, subjectsValue, Keys.ENTER);


        WebElement pictureField = getGetWebDriver().findElement(By.id("uploadPicture"));
        String filePath = "src/test/resources/me.jpg";
        elementMethods.filledElement(pictureField, new File(filePath).getAbsolutePath());

        WebElement addressField = getGetWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String addressValue="test";
        elementMethods.filledElement(addressField, addressValue);


        WebElement stateField = getGetWebDriver().findElement(By.xpath("//div[text()='Select State']"));
        elementMethods.clickElement(stateField);


        String stateValue = "NCR";
        WebElement stateInputFiled = getGetWebDriver().findElement(By.id("react-select-3-input"));
        elementMethods.fillPressElement(stateInputFiled, stateValue, Keys.ENTER);


        String cityValue = "Delhi";
        WebElement cityField = getGetWebDriver().findElement(By.xpath("//div[text()='Select City']"));
        elementMethods.clickElement(cityField);


        WebElement cityInputField = getGetWebDriver().findElement(By.id("react-select-4-input"));
        elementMethods.fillPressElement(cityInputField, cityValue, Keys.ENTER);

        WebElement submit = getGetWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submit);


        //validam tabelul cu valori
        List<WebElement> labelFields = getGetWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> valueFields = getGetWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
        Assert.assertEquals(valueFields.get(0).getText(), firstNameValue + " " + lastNameValue);


        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
        Assert.assertEquals(valueFields.get(1).getText(), emailValue);

        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
        Assert.assertEquals(valueFields.get(2).getText(), genderValue);

        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
        Assert.assertEquals(valueFields.get(3).getText(), numarValue);

        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
        Assert.assertEquals(valueFields.get(5).getText(), subjectsValue);

        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
        for (Integer index = 0; index < hobbies.size(); index++) {
            Assert.assertTrue(valueFields.get(6).getText().contains(hobbies.get(index)));
        }

        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
        String[] arrayFile = filePath.split("/");
        Integer desireIndex = arrayFile.length -1;
        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desireIndex]);

        Assert.assertEquals(labelFields.get(8).getText(), "Address");
        Assert.assertEquals(valueFields.get(8).getText(), addressValue);


        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
        Assert.assertEquals(valueFields.get(9).getText(), stateValue + " " + cityValue);

        //tema sa terminam validare

    }

    public void genderFiled(String gender) {
        if (gender == "Male") {
            WebElement genderField = getGetWebDriver().findElement(By.cssSelector("label[for=gender-radio-1]"));
            genderField.click();
        } else if (gender == "Female") {
            WebElement genderField = getGetWebDriver().findElement(By.cssSelector("label[for=gender-radio-2]"));
            genderField.click();

        } else  {
            WebElement genderField = getGetWebDriver().findElement(By.cssSelector("label[for=gender-radio-3]"));
            genderField.click();
        }
    }

}
