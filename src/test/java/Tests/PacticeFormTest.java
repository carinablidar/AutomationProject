package Tests;

import Pages.HomePage;
import Pages.FormPage;
import Pages.PractiseFormsPage;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PacticeFormTest extends ShareData {



    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getGetWebDriver());
        homePage.navigateToFormsPage();


        FormPage practiceFormPage = new FormPage(getGetWebDriver());
        practiceFormPage.navigateToPracticeForm();


        String firstNameValue = "Carina";
        String lastNameValue = "Blidar";
        String emailValue = "test@yahoo.com";
        String numarValue = "1234567890";
        String monthValue = "6";
        String yearValue = "1995";
        String dayValue = "17";
        String genderValue = "Male";
        List<String> hobbies = Arrays.asList("Sports", "Music", "Reading");
        String subjectsValue = "Economics";
        String filePath = "src/test/resources/me.jpg";
        String addressValue="test";
        String stateValue = "NCR";
        String cityValue = "Delhi";


        PractiseFormsPage practiseFormsPage = new PractiseFormsPage(getGetWebDriver());
        practiseFormsPage.fillEntireForm(firstNameValue, lastNameValue, emailValue, numarValue, monthValue,
                yearValue, dayValue, genderValue, hobbies, subjectsValue,filePath, addressValue, stateValue, cityValue);
        practiseFormsPage.validatePractiseFormTable(firstNameValue, lastNameValue, emailValue, genderValue,
                numarValue, subjectsValue, hobbies, filePath,
                addressValue, stateValue, cityValue);
    }
}
