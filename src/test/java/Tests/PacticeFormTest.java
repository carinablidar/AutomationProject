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
        String emailValue = "test@test";
        String numarValue = "02555414";
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
        practiseFormsPage.fillFirstName(firstNameValue);
        practiseFormsPage.fillLastName(lastNameValue);
        practiseFormsPage.fillEmail(emailValue);
        practiseFormsPage.fillNumarField(numarValue);
        practiseFormsPage.fillDateOfBirth(monthValue, yearValue, dayValue);
        practiseFormsPage.pickGender(genderValue);
        practiseFormsPage.pickHobbies(hobbies);
        practiseFormsPage.pickSubject(subjectsValue);
        practiseFormsPage.uploadPicture(filePath);
        practiseFormsPage.pickAddress(addressValue);
        practiseFormsPage.fillState(stateValue);
        practiseFormsPage.pickCity(cityValue);
        practiseFormsPage.clickSubmit();






//        //validam tabelul cu valori
//        List<WebElement> labelFields = getGetWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
//        List<WebElement> valueFields = getGetWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));
//
//        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
//        Assert.assertEquals(valueFields.get(0).getText(), firstNameValue + " " + lastNameValue);
//
//
//        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
//        Assert.assertEquals(valueFields.get(1).getText(), emailValue);
//
//        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
//        Assert.assertEquals(valueFields.get(2).getText(), genderValue);
//
//        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
//        Assert.assertEquals(valueFields.get(3).getText(), numarValue);
//
//        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
//        Assert.assertEquals(valueFields.get(5).getText(), subjectsValue);
//
//        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
//        for (Integer index = 0; index < hobbies.size(); index++) {
//            Assert.assertTrue(valueFields.get(6).getText().contains(hobbies.get(index)));
//        }
//
//        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
//        String[] arrayFile = filePath.split("/");
//        Integer desireIndex = arrayFile.length -1;
//        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desireIndex]);
//
//        Assert.assertEquals(labelFields.get(8).getText(), "Address");
//        Assert.assertEquals(valueFields.get(8).getText(), addressValue);
//
//
//        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
//        Assert.assertEquals(valueFields.get(9).getText(), stateValue + " " + cityValue);

        //tema sa terminam validare

    }


}
