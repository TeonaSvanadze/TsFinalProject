package Utils;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ChromeRunner {
    public static WebDriver driver = new ChromeDriver();

    @BeforeMethod
    @Description("The user tries to open chrome brother and enter on this site : postalon.com")
    public void openChrome(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://postalon.com/");
    }
    @AfterMethod
    @Description("The use tries to close the page after running every test")
    public void closeChrome(){
        driver.close();
    }
}
