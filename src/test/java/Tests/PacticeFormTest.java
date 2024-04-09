package Tests;

import ObjectData.PracticeFormObject;
import Pages.FormPage;
import Pages.HomePage;
import Pages.PractiseFormsPage;
import ProertyUtility.PropertyUtility;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class PacticeFormTest extends Hooks {



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
