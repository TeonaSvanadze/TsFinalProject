package DataObject;

import com.github.javafaker.Faker;

public interface RegistrationDate {
    Faker faker = new Faker();
    String

    validRegistrationEmail = faker.bothify("?????###@gmail.com"),
    validEmail   = faker.bothify("??#@gmail.com"),
    latinName = "test",
    latinLastName = "testtest",
    nameInGeorgian = "ტესტ",
    lastNameInGeorgian = "ტესტირება",
    idNumber = "01463527653",
    phoneNumber = "500123456 ",
    address = "testirebis # 90",
    correctPassword = "Test@123",
    correctRepeatThePassword = "Test@123",
    wrongIdNumber = "122334";



}
