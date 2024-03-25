package ObjectData;

import java.util.Map;

public class WebTableObject {

    private String firstnameValue;
    private String lastnameValue;
    private String emailValue;
    private String ageValue;
    private String salaryValue;
    private String departamentValue;
    private String firstnameModifyValue;
    private String ageModifyValue;


    //facem o metoda care sa mapeze datele din fisierul de resursa cu preprezentarea acestui obiect

    public WebTableObject(Map<String, String> testData) {
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData) {
        for(String key: testData.keySet()) {
            switch (key) {
                case "firstnameValue":
                    setFirstnameValue(testData.get(key));
                    break;
                case "lastnameValue":
                    setLastnameValue(testData.get(key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;
                case "ageValue":
                    setAgeValue(testData.get(key));
                    break;
                case "salaryValue":
                    setSalaryValue(testData.get(key));
                    break;
                case "departamentValue":
                    setDepartamentValue(testData.get(key));
                    break;
                case "firstnameModifyValue":
                    setFirstnameModifyValue(testData.get(key));
                    break;
                case "ageModifyValue":
                    setAgeModifyValue(testData.get(key));
            }
        }
    }

    public String getFirstnameValue() {
        return firstnameValue;
    }

    public String getLastnameValue() {
        return lastnameValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public String getSalaryValue() {
        return salaryValue;
    }

    public String getDepartamentValue() {
        return departamentValue;
    }

    public String getFirstnameModifyValue() {
        return firstnameModifyValue;
    }

    public String getAgeModifyValue() {
        return ageModifyValue;
    }

    public void setFirstnameValue(String firstnameValue) {
        this.firstnameValue = firstnameValue;
    }

    public void setLastnameValue(String lastnameValue) {
        this.lastnameValue = lastnameValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public void setDepartamentValue(String departamentValue) {
        this.departamentValue = departamentValue;
    }

    public void setFirstnameModifyValue(String firstnameModifyValue) {
        this.firstnameModifyValue = firstnameModifyValue;
    }

    public void setAgeModifyValue(String ageModifyValue) {
        this.ageModifyValue = ageModifyValue;
    }
}
