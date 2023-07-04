import PageStep.RegistrationSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;
import static DataObject.RegistrationDate.*;


public class Registration extends ChromeRunner {

    @Test (priority = 1)
    public void registrationWithCorrectData () throws InterruptedException {
        RegistrationSteps step1 = new RegistrationSteps(ChromeRunner.driver);
        step1.registerButton();
        Thread.sleep(3000);
        step1.selectCityDropDown();
        step1.emailField(validRegistrationEmail);
        step1.nameFieldLatin(latinName);
        step1.lastNameFieldLatin(latinLastName);
        step1.nameFieldGeo(nameInGeorgian);
        step1.lastNameFieldGeo(lastNameInGeorgian);
        step1.idNumber(idNumber);
        step1.phoneNumber(phoneNumber);
        step1.selectDistrictDropDown();
        step1.address(address);
        step1.passwordInput(correctPassword);
        step1.repeatPasswordInput(correctRepeatThePassword);
        step1.clickTermsAndConditions();
        step1.endRegistrationButton();
        Thread.sleep(5000);
    }

    @Test (priority = 2)
    public void registrationWithINCorrectIdNumber () throws InterruptedException {
        RegistrationSteps step1 = new RegistrationSteps(ChromeRunner.driver);
        step1.registerButton();
        Thread.sleep(3000);
        step1.selectCityDropDown();
        step1.emailField(validEmail);
        step1.nameFieldLatin(latinName);
        step1.lastNameFieldLatin(latinLastName);
        step1.nameFieldGeo(nameInGeorgian);
        step1.lastNameFieldGeo(lastNameInGeorgian);
        step1.idNumber(wrongIdNumber);
        step1.phoneNumber(phoneNumber);
        step1.selectDistrictDropDown();
        step1.address(address);
        step1.passwordInput(correctPassword);
        step1.repeatPasswordInput(correctRepeatThePassword);
        step1.clickTermsAndConditions();
        step1.endRegistrationButton();
        step1.checkErrorMessage();
        Thread.sleep(5000);
    }
    @Test (priority = 3)
    public void registrationWithOutEmail () throws InterruptedException {
        RegistrationSteps step1 = new RegistrationSteps(ChromeRunner.driver);
        step1.registerButton();
        Thread.sleep(3000);
        step1.selectCityDropDown();
        step1.nameFieldLatin(latinName);
        step1.lastNameFieldLatin(latinLastName);
        step1.nameFieldGeo(nameInGeorgian);
        step1.lastNameFieldGeo(lastNameInGeorgian);
        step1.idNumber(wrongIdNumber);
        step1.phoneNumber(phoneNumber);
        step1.selectDistrictDropDown();
        step1.address(address);
        step1.passwordInput(correctPassword);
        step1.repeatPasswordInput(correctRepeatThePassword);
        step1.clickTermsAndConditions();
        step1.endRegistrationButton();
        step1.checkErrorMessage2();
        Thread.sleep(5000);
    }
    @Test (priority = 4)
    public void registrationWithOutNameFieldLatin () throws InterruptedException {
        RegistrationSteps step1 = new RegistrationSteps(ChromeRunner.driver);
        step1.registerButton();
        Thread.sleep(3000);
        step1.selectCityDropDown();
        step1.emailField(validEmail);
        step1.lastNameFieldLatin(latinLastName);
        step1.nameFieldGeo(nameInGeorgian);
        step1.lastNameFieldGeo(lastNameInGeorgian);
        step1.idNumber(wrongIdNumber);
        step1.phoneNumber(phoneNumber);
        step1.selectDistrictDropDown();
        step1.address(address);
        step1.passwordInput(correctPassword);
        step1.repeatPasswordInput(correctRepeatThePassword);
        step1.clickTermsAndConditions();
        step1.endRegistrationButton();
        step1.checkErrorMessage2();
        Thread.sleep(5000);
    }
    @Test (priority = 5)
    public void registrationWithOutLastNameFieldLatin () throws InterruptedException {
        RegistrationSteps step1 = new RegistrationSteps(ChromeRunner.driver);
        step1.registerButton();
        Thread.sleep(3000);
        step1.selectCityDropDown();
        step1.emailField(validEmail);
        step1.nameFieldLatin(latinName);
        step1.nameFieldGeo(nameInGeorgian);
        step1.lastNameFieldGeo(lastNameInGeorgian);
        step1.idNumber(wrongIdNumber);
        step1.phoneNumber(phoneNumber);
        step1.selectDistrictDropDown();
        step1.address(address);
        step1.passwordInput(correctPassword);
        step1.repeatPasswordInput(correctRepeatThePassword);
        step1.clickTermsAndConditions();
        step1.endRegistrationButton();
        step1.checkErrorMessage2();
        Thread.sleep(5000);
    }
    @Test (priority = 6)
    public void registrationWithOutPhoneNumber () throws InterruptedException {
        RegistrationSteps step1 = new RegistrationSteps(ChromeRunner.driver);
        step1.registerButton();
        Thread.sleep(3000);
        step1.selectCityDropDown();
        step1.emailField(validRegistrationEmail);
        step1.nameFieldLatin(latinName);
        step1.lastNameFieldLatin(latinLastName);
        step1.nameFieldGeo(nameInGeorgian);
        step1.lastNameFieldGeo(lastNameInGeorgian);
        step1.idNumber(idNumber);
        step1.selectDistrictDropDown();
        step1.address(address);
        step1.passwordInput(correctPassword);
        step1.repeatPasswordInput(correctRepeatThePassword);
        step1.clickTermsAndConditions();
        step1.endRegistrationButton();
        step1.checkErrorMessage2();
        Thread.sleep(5000);
    }
    @Test (priority = 7)
    public void registrationWithOutPassword () throws InterruptedException {
        RegistrationSteps step1 = new RegistrationSteps(ChromeRunner.driver);
        step1.registerButton();
        Thread.sleep(3000);
        step1.selectCityDropDown();
        step1.emailField(validEmail);
        step1.nameFieldLatin(latinName);
        step1.lastNameFieldLatin(latinLastName);
        step1.nameFieldGeo(nameInGeorgian);
        step1.lastNameFieldGeo(lastNameInGeorgian);
        step1.idNumber(idNumber);
        step1.phoneNumber(phoneNumber);
        step1.selectDistrictDropDown();
        step1.address(address);
        step1.repeatPasswordInput(correctRepeatThePassword);
        step1.clickTermsAndConditions();
        step1.endRegistrationButton();
        step1.checkErrorMessage3();
        Thread.sleep(5000);
    }
    @Test (priority = 8)
    public void registrationWithOutRepeatPassword () throws InterruptedException {
        RegistrationSteps step1 = new RegistrationSteps(ChromeRunner.driver);
        step1.registerButton();
        Thread.sleep(3000);
        step1.selectCityDropDown();
        step1.emailField(validEmail);
        step1.nameFieldLatin(latinName);
        step1.lastNameFieldLatin(latinLastName);
        step1.nameFieldGeo(nameInGeorgian);
        step1.lastNameFieldGeo(lastNameInGeorgian);
        step1.idNumber(idNumber);
        step1.phoneNumber(phoneNumber);
        step1.selectDistrictDropDown();
        step1.address(address);
        step1.passwordInput(correctPassword);
        step1.clickTermsAndConditions();
        step1.endRegistrationButton();
        step1.checkErrorMessage4();
        Thread.sleep(5000);
    }






}
