package PageObject;

import org.openqa.selenium.By;

public class LogInPage {
    protected By
            emailInput = By.id("username"),
            passwordInput = By.id("password"),
            logInButton = By.className("btn-success"),
            errorMessage = By.id("check");



}
