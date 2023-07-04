package DataObject;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

public interface LogInData {
    Faker faker = new Faker();
    String
            incorrectEmailData = faker.bothify("?????###@gmail.com"),
            incorrectPassword = "3378483",
            correctEmailData = " mafey40069@aaorsi.com",
            correctPasswordData = "Teona@123",
            incorrectIDNumber = "123455";


}
