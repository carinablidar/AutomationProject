package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public void fillFirstName(String firstNameValue) {

        elementMethods.filledElement(firstNameField, firstNameValue);
        elementMethods.ScrollElementByPixel(0, 450);
    }

    public void fillLastName(String lastNameValue) {
        elementMethods.filledElement(lastNameField, lastNameValue);
    }

    public void fillEmail(String emailValue) {
        elementMethods.filledElement(emailField, emailValue);
    }

    public void fillNumarField(String numarValue) {

        elementMethods.filledElement(numarField, numarValue);
    }

    public void fillDateOfBirth(String monthValue, String yearValue, String dayValue) {
        elementMethods.clickElement(dateOfBirthField);
        elementMethods.clickElement(datePicker);
        elementMethods.selectValueElement(monthDateOfBirth, monthValue);
        elementMethods.selectTextElement(yearDateOfBirth, yearValue);


        for (Integer i = 0; i < dayDateOfBirthFields.size(); i++) {
            if (dayDateOfBirthFields.get(i).getText().equals(dayValue)) {
                dayDateOfBirthFields.get(i).click();
                break;
            }
        }
    }


    public  void pickGender(String genderValue) {
        elementMethods.clickElement(genderField);
    }

    public void pickHobbies(List<String> hobbies) {

        for (int i = 0; i < hobbiesLabelsList.size(); i++) {
            String currentElementText = hobbiesLabelsList.get(i).getText();
            if (hobbies.contains(currentElementText)) {
                elementMethods.clickElement(hobbiesLabelsList.get(i));
            }
        }
    }

    public void pickSubject(String subjectsValue) {
        elementMethods.fillPressElement(subjectsField, subjectsValue, Keys.ENTER);
    }

    public void uploadPicture(String filePath) {
        elementMethods.filledElement(pictureField, new File(filePath).getAbsolutePath());
    }

    public void pickAddress(String addressValue) {

        elementMethods.filledElement(addressField, addressValue);
    }

    public void fillState( String stateValue) {

        elementMethods.clickElement(stateField);
        elementMethods.fillPressElement(stateInputFiled, stateValue, Keys.ENTER);
    }

    public void pickCity(String cityValue) {

        elementMethods.clickElement(cityField);
        elementMethods.fillPressElement(cityInputField, cityValue, Keys.ENTER);
    }

    public void clickSubmit() {
       elementMethods.clickElement(submit);
    }


















}
