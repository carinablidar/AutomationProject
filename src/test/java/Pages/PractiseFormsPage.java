package Pages;

import ObjectData.PracticeFormObject;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class PractiseFormsPage extends BasePage {
    public PractiseFormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    private WebDriver getWebDriver;

    @BeforeMethod
    public void prepareDriver() {

        //deschide un browser de Chrome
        getWebDriver = new ChromeDriver();

        //accesam un URL
        getWebDriver.get("https://demoqa.com/");

        //maximizare fereastra
        getWebDriver.manage().window().maximize();

        //wait implicit
        getWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void clearDriver() {

        getWebDriver.quit();

    }

    public WebDriver getGetWebDriver() {
        return getWebDriver;
    }

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(css = "input[placeholder='Last Name")
    private WebElement lastNameField;

    @FindBy(css = "input[placeholder='name@example.com")
    private WebElement emailField;

    @FindBy(css = "input[placeholder='Mobile Number")
    private WebElement numarField;

    @FindBy(css = ".react-datepicker__input-container")
    private WebElement dateOfBirthField;

    @FindBy(css = ".react-datepicker__month-dropdown-container--select")
    private WebElement datePicker;

    @FindBy(css = ".react-datepicker__month-select")
    private WebElement monthDateOfBirth;

    @FindBy(css = ".react-datepicker__year-select")
    private WebElement yearDateOfBirth;

    @FindBy(xpath = "//div[not(contains(@class, 'outside-month')) and contains(@class, 'react-datepicker__day react-datepicker__day')]")
    private List<WebElement> dayDateOfBirthFields;

    @FindBy(css = "label[for=gender-radio-1]")
    private WebElement genderField;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    private List<WebElement> hobbiesLabelsList;

    @FindBy(id = "subjectsInput")
    private WebElement subjectsField;

    @FindBy(id = "uploadPicture")
    private WebElement pictureField;

    @FindBy(css = "textarea[placeholder='Current Address']")
    private WebElement addressField;

    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement stateField;

    @FindBy(id = "react-select-3-input")
    private WebElement stateInputFiled;

    @FindBy(xpath = "//div[text()='Select City']")
    private WebElement cityField;

    @FindBy(id = "react-select-4-input")
    private WebElement cityInputField;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(xpath = "//table/tbody/tr/td[1]")
    private  List<WebElement> labelFields;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> valueFields;

    public void fillFirstName(String firstNameValue) {

        elementMethods.filledElement(firstNameField, firstNameValue);
        LoggerUtility.infoTest("The user filled first name field");

        elementMethods.ScrollElementByPixel(0, 450);
        LoggerUtility.infoTest("The user scroll down the page");
    }

    public void fillLastName(String lastNameValue) {
        elementMethods.filledElement(lastNameField, lastNameValue);
        LoggerUtility.infoTest("The user filled last name field");
    }

    public void fillEmail(String emailValue) {
        elementMethods.filledElement(emailField, emailValue);
        LoggerUtility.infoTest("The user filled email field");
    }

    public void fillNumarField(String numarValue) {
        elementMethods.filledElement(numarField, numarValue);
        LoggerUtility.infoTest("The user filled number field");
    }

    public void fillDateOfBirth(String monthValue, String yearValue, String dayValue) {
        elementMethods.clickElement(dateOfBirthField);
        LoggerUtility.infoTest("The user filled date of birth field");

        elementMethods.clickElement(datePicker);
        LoggerUtility.infoTest("The user filled date field");

        elementMethods.selectValueElement(monthDateOfBirth, monthValue);
        LoggerUtility.infoTest("The user filled month field");

        elementMethods.selectTextElement(yearDateOfBirth, yearValue);
        LoggerUtility.infoTest("The user filled year field");


        for (Integer i = 0; i < dayDateOfBirthFields.size(); i++) {
            if (dayDateOfBirthFields.get(i).getText().equals(dayValue)) {
                dayDateOfBirthFields.get(i).click();
                LoggerUtility.infoTest("The user filled day field");
                break;
            }
        }
    }


    public  void pickGender(String genderValue) {
        elementMethods.clickElement(genderField);
        LoggerUtility.infoTest("The user filled gender field");
    }

    public void pickHobbies(List<String> hobbies) {

        for (int i = 0; i < hobbiesLabelsList.size(); i++) {
            String currentElementText = hobbiesLabelsList.get(i).getText();
            if (hobbies.contains(currentElementText)) {
                elementMethods.clickElement(hobbiesLabelsList.get(i));
                LoggerUtility.infoTest("The user filled hobbies field");
            }
        }
    }

    public void pickSubject(String subjectsValue) {
        elementMethods.fillPressElement(subjectsField, subjectsValue, Keys.ENTER);
        LoggerUtility.infoTest("The user filled subject field");
    }

    public void uploadPicture(String filePath) {
        elementMethods.filledElement(pictureField, new File(filePath).getAbsolutePath());
        LoggerUtility.infoTest("The user filled picture field");
    }

    public void pickAddress(String addressValue) {
        elementMethods.filledElement(addressField, addressValue);
        LoggerUtility.infoTest("The user filled address field");
    }

    public void fillState( String stateValue) {
        elementMethods.clickElement(stateField);
        LoggerUtility.infoTest("The user filled state field");

        elementMethods.fillPressElement(stateInputFiled, stateValue, Keys.ENTER);
        LoggerUtility.infoTest("The user press on state element");
    }

    public void pickCity(String cityValue) {
        elementMethods.clickElement(cityField);
        LoggerUtility.infoTest("The user filled city field");

        elementMethods.fillPressElement(cityInputField, cityValue, Keys.ENTER);
        LoggerUtility.infoTest("The user press on city element");
    }

    public void clickSubmit() {
       elementMethods.clickElement(submit);
        LoggerUtility.infoTest("The user clicks on submit button");
    }

    public void validatePractiseFormTable(PracticeFormObject practiceFormObject) {


        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
        Assert.assertEquals(valueFields.get(0).getText(), practiceFormObject.getFirstNameValue() + " " + practiceFormObject.getLastNameValue());
        LoggerUtility.infoTest("The user validates the first name and last name values");

        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
        Assert.assertEquals(valueFields.get(1).getText(), practiceFormObject.getEmailValue());
        LoggerUtility.infoTest("The user validates the email value");

        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
        Assert.assertEquals(valueFields.get(2).getText(), practiceFormObject.getGenderValue());
        LoggerUtility.infoTest("The user validates the gender value");

        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
        Assert.assertEquals(valueFields.get(3).getText(), practiceFormObject.getNumarValue());
        LoggerUtility.infoTest("The user validates the mobile value");

        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
        Assert.assertEquals(valueFields.get(5).getText(), practiceFormObject.getSubjectsValue());
        LoggerUtility.infoTest("The user validates the subject value");

        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
        for (Integer index = 0; index < practiceFormObject.getHobbies().size(); index++) {
            Assert.assertTrue(valueFields.get(6).getText().contains(practiceFormObject.getHobbies().get(0)));
            LoggerUtility.infoTest("The user validates the hobbies value");
        }

        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
        String[] arrayFile = practiceFormObject.getFilePath().split("/");
        Integer desireIndex = arrayFile.length -1;
        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desireIndex]);
        LoggerUtility.infoTest("The user validates the picture value");

        Assert.assertEquals(labelFields.get(8).getText(), "Address");
        Assert.assertEquals(valueFields.get(8).getText(), practiceFormObject.getAddressValue());
        LoggerUtility.infoTest("The user validates the address value");

        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
        Assert.assertEquals(valueFields.get(9).getText(), practiceFormObject.getStateValue() + " " + practiceFormObject.getCityValue());
        LoggerUtility.infoTest("The user validates the state and city values");
    }


    public void fillEntireForm(PracticeFormObject practiceFormObject) {
        fillFirstName(practiceFormObject.getFirstNameValue());
        LoggerUtility.infoTest("The user filled first name field with fillEntireForm");

        fillLastName(practiceFormObject.getLastNameValue());
        LoggerUtility.infoTest("The user filled last name field with fillEntireForm");

        fillEmail(practiceFormObject.getEmailValue());
        LoggerUtility.infoTest("The user filled email field with fillEntireForm");

        fillNumarField(practiceFormObject.getNumarValue());
        LoggerUtility.infoTest("The user filled number field with fillEntireForm");

        fillDateOfBirth(practiceFormObject.getMonthValue(), practiceFormObject.getYearValue(), practiceFormObject.getDayValue());
        LoggerUtility.infoTest("The user filled date of birth field with fillEntireForm");

        pickGender(practiceFormObject.getGenderValue());
        LoggerUtility.infoTest("The user filled gender field with fillEntireForm");

        pickHobbies(practiceFormObject.getHobbies());
        LoggerUtility.infoTest("The user filled hobbies field with fillEntireForm");

        pickSubject(practiceFormObject.getSubjectsValue());
        LoggerUtility.infoTest("The user filled subject field with fillEntireForm");

        uploadPicture(practiceFormObject.getFilePath());
        LoggerUtility.infoTest("The user filled picture field with fillEntireForm");

        pickAddress(practiceFormObject.getAddressValue());
        LoggerUtility.infoTest("The user filled address field with fillEntireForm");

        fillState(practiceFormObject.getStateValue());
        LoggerUtility.infoTest("The user filled state field with fillEntireForm");

        pickCity(practiceFormObject.getCityValue());
        LoggerUtility.infoTest("The user filled city field with fillEntireForm");

        clickSubmit();
        LoggerUtility.infoTest("The user clicks on submit button with fillEntireForm");
    }
















}
