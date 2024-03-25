package ObjectData;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PracticeFormObject extends GeneralObject {
    private String firstNameValue;
    private String lastNameValue;
    private String emailValue;
    private String numarValue;
    private String monthValue;
    private String yearValue;
    private String dayValue;
    private String genderValue;
    private List<String> hobbies;
    private String subjectsValue;
    private String filePath;
    private String addressValue;
    private String stateValue;
    private String cityValue;

    public PracticeFormObject(Map<String, String> testData) {
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData) {
        for(String key: testData.keySet()) {
            switch (key) {
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;
                case "numarValue":
                    setNumarValue(testData.get(key));
                    break;
                case "monthValue":
                    setMonthValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
                case "dayValue":
                    setDayValue(testData.get(key));
                    break;
                case "genderValue":
                   setGenderValue(testData.get(key));
                   break;
                case "hobbies":
                    hobbies = gePreparedValue(testData.get(key));
                    break;
                case "subjectsValue":
                    setSubjectsValue(testData.get(key));
                    break;
                case "filePath":
                    setFilePath(testData.get(key));
                    break;
                case "addressValue":
                    setAddressValue(testData.get(key));
                    break;
                case "stateValue":
                    setStateValue(testData.get(key));
                    break;
                case "cityValue":
                    setCityValue(testData.get(key));
                    break;
            }
        }
    }


    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getNumarValue() {
        return numarValue;
    }

    public void setNumarValue(String numarValue) {
        this.numarValue = numarValue;
    }

    public String getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getSubjectsValue() {
        return subjectsValue;
    }

    public void setSubjectsValue(String subjectsValue) {
        this.subjectsValue = subjectsValue;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }
}

