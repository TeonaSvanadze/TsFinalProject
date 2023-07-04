package PageStep;

import PageObject.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RegistrationSteps extends RegistrationPage {

    WebDriver driver;

    public RegistrationSteps(WebDriver driver7) { driver = driver7; }

    public void selectCityDropDown(){
         driver.findElement(selectDropDown).click();

        Select selectOption = new Select (driver.findElement(selectDropDown));
//        selectOption.selectByVisibleText("თბილისი");
        selectOption.selectByIndex(1);
    }

    public void selectDistrictDropDown(){
        driver.findElement(districtDropDown).click();

        Select selectOption = new Select (driver.findElement(districtDropDown));
        selectOption.selectByIndex(27);
    }
    public void registerButton() {
        driver.findElement(registerButton).click();
    }
    public void emailField(String s) {
        driver.findElement(emailField).sendKeys(s);

    }
    public void nameFieldLatin(String s) {
        driver.findElement(nameFieldLatin).sendKeys(s);

    }

    public void lastNameFieldLatin(String s) {
        driver.findElement(lastNameFieldLatin).sendKeys(s);

    }
    public void nameFieldGeo(String s) {
        driver.findElement(nameFieldGeo).sendKeys(s);
    }

    public void lastNameFieldGeo(String s) {
        driver.findElement(lastNameFieldGeo).sendKeys(s);
    }
    public void idNumber(String s) {
        driver.findElement(idNumber).sendKeys(s);
    }
    public void phoneNumber(String s) {
        driver.findElement(phoneNumber).sendKeys(s);
    }
    public void passwordInput(String s) {
        driver.findElement(passwordInput).sendKeys(s);
    }
    public void repeatPasswordInput(String s) {
        driver.findElement(repeatPasswordInput).sendKeys(s);
    }
    public void clickTermsAndConditions() {
        driver.findElement(clickTermsAndConditions).click();

    }
    public void address(String s) {
        driver.findElement(address).sendKeys(s);
    }
    public void endRegistrationButton() {
        driver.findElement(endRegistrationButton).click();

    }
    public void checkErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String errorMessageText = driver.findElement(errorMessage).getText();
        System.out.println(errorMessageText);
        Assert.assertTrue(errorMessageText.contains("გთხოვთ კორექტულად შეიყვანოთ თქვენი პირადი ნომერი"));
    }
    public void emailField2(String s) {
        driver.findElement(emailField).sendKeys(s);

    }
    public void checkErrorMessage2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String errorMessageText = driver.findElement(errorMessage).getText();
        System.out.println(errorMessageText);
        Assert.assertTrue(errorMessageText.contains("ვარსკვლავით (*) აღნიშნული ველების შევსება აუცილებელია"));
    }
    public void checkErrorMessage3() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String errorMessageText = driver.findElement(errorMessage).getText();
        System.out.println(errorMessageText);
        Assert.assertTrue(errorMessageText.contains("პაროლი უნდა იყოს არანაკლებ 6 სიმბოლოსი"));
    }
    public void checkErrorMessage4() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String errorMessageText = driver.findElement(errorMessage).getText();
        System.out.println(errorMessageText);
        Assert.assertTrue(errorMessageText.contains("პაროლები არ ემთხვევა ერთმანეთს"));
    }




}
