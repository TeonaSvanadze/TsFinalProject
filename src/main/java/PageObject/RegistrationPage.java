package PageObject;

import org.openqa.selenium.By;

public class RegistrationPage {
    protected By

            selectDropDown = By.id("city_id"),
            registerButton = By.className("btn-light"),
            emailField = By.id("mail"),
            nameFieldLatin = By.id("name"),
            lastNameFieldLatin = By.id("surname"),
            nameFieldGeo = By.id("name_geo"),
            lastNameFieldGeo = By.id("surname_geo"),
            idNumber = By.id("pid"),
            phoneNumber = By.id("tel"),
            districtDropDown = By.id("district_id"),
            address = By.id("address"),
            passwordInput = By.id("password"),
            repeatPasswordInput = By.id("re_password"),
            endRegistrationButton = By.id("submit"),
            clickTermsAndConditions = By.id("license"),
            errorMessage = By.id("check");
}

