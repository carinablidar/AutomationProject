package Tests;

import ObjectData.PracticeFormObject;
import ObjectData.WebTableObject;
import Pages.HomePage;
import Pages.FormPage;
import Pages.PractiseFormsPage;
import ProertyUtility.PropertyUtility;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PacticeFormTest extends ShareData {



    @Test
    public void metodaTest() {

        PropertyUtility propertyUtility = new PropertyUtility("PracticeFormData");
        PracticeFormObject practiceFormObject = new PracticeFormObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getGetWebDriver());
        homePage.navigateToFormsPage();

        FormPage practiceFormPage = new FormPage(getGetWebDriver());
        practiceFormPage.navigateToPracticeForm();


        PractiseFormsPage practiseFormsPage = new PractiseFormsPage(getGetWebDriver());
        practiseFormsPage.fillEntireForm(practiceFormObject);
        practiseFormsPage.validatePractiseFormTable(practiceFormObject);
    }
}
