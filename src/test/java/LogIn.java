import PageStep.LogInSteps;
import Utils.ChromeRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static DataObject.LogInData.*;

public class LogIn extends ChromeRunner {
    @Test (priority = 1)

    public void LogInWithIncorrectData() throws InterruptedException {

        LogInSteps step1 = new LogInSteps(ChromeRunner.driver);
        step1.emailInput(incorrectEmailData);
        step1.passwordInput(incorrectPassword);
        step1.logInButton();
        step1.checkErrorMessage();
        Thread.sleep(5000);


    }

    @Test(priority = 2)

    public void LogInWithCorrectEmail() throws InterruptedException {


        LogInSteps step2 = new LogInSteps(ChromeRunner.driver);
        step2.emailInput(correctEmailData);
        step2.passwordInput(correctPasswordData);
        step2.logInButton();
        Thread.sleep(5000);


    }

    @Test (priority = 3)

    public void emptyEmailAndPassword() throws InterruptedException {


        LogInSteps step3 = new LogInSteps(ChromeRunner.driver);
        step3.logInButton();
        step3.checkErrorMessage();
        Thread.sleep(5000);
    }
}
