import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationFlow {
    protected WebDriver driver;
    protected static final String ALMATAR_WEB_SITE = "https://almatar.com/";


    @Before
    public void goToAlmatarWebsite() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions().setHeadless(false);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(ALMATAR_WEB_SITE);
        driver.manage().window().maximize();

    }


    @Test

    public void CreateAccount() {

        register("Aya",
                "Shoaib",
                "Aya.shoaib25@gmail.com",
                "556289622",
                "123123123");
    }


    protected WebElement waitForElementToBeVisible(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(selector));
    }


    public void register(String firstname, String lastname, String email, String number, String password) {
        WebElement SignupBtn = waitForElementToBeVisible(By.cssSelector("button[class=\"fill-btn\"]"));
        SignupBtn.click();

        WebElement Firstname = waitForElementToBeVisible(By.cssSelector("input[name=\"firstName\"]"));
        Firstname.sendKeys(firstname);

        WebElement Lastname = waitForElementToBeVisible(By.cssSelector("input[name=\"lastName\"]"));
        Lastname.sendKeys(lastname);

        WebElement Email = waitForElementToBeVisible(By.cssSelector("input[name=\"emailOrphone\"]"));
        Email.sendKeys(email);

        WebElement Mobile = waitForElementToBeVisible(By.cssSelector("input[class=\"phone-number-input ng-untouched ng-pristine ng-invalid\"]"));
        Mobile.sendKeys(number);

        WebElement Password = waitForElementToBeVisible(By.cssSelector("input[name=\"password\"]"));
        Password.sendKeys(password);

        WebElement Checkbox = waitForElementToBeVisible(By.cssSelector("span[class=\"checkmark\"]"));
        Checkbox.click();

        WebElement RegisterBtn = waitForElementToBeVisible(By.cssSelector("button[class=\"float-right btn btn-success\"]"));
        RegisterBtn.click();

    }

}



