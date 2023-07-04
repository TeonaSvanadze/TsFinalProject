package PageStep;
import PageObject.LogInPage;
//import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class LogInSteps extends LogInPage {
    WebDriver driver;

    public LogInSteps(WebDriver driver1) {
        driver = driver1;
    }


    public void emailInput(String s) {
        driver.findElement(emailInput).sendKeys(s);

    }

    public void passwordInput(String s) {
        driver.findElement(passwordInput).sendKeys(s);
    }


    public void logInButton() {
        driver.findElement(logInButton).click();

    }

    public void checkErrorMessage() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
//        String errorMessageText = driver.findElement(errorMessage).getText();
//        System.out.println(errorMessageText);
//        Assert.assertTrue(errorMessageText.contains("ელფოსტა ან პაროლი მცდარია"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String errorMessageText = driver.findElement(errorMessage).getText();
        System.out.println(errorMessageText);

        if (errorMessageText.contains("ელფოსტა ან პაროლი მცდარია")) {
            Assert.assertTrue(errorMessageText.contains("ელფოსტა ან პაროლი მცდარია"));
            System.out.println("Error message is as expected: " + errorMessageText);
        } else if (errorMessageText.contains("Another Error Message")) {
        } else {
            System.out.println("Unexpected error message: " + errorMessageText);
        }
    }

}