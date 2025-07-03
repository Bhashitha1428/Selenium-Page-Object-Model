package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC002_RegisterLoginUserTest {

    WebDriver driver;

    @BeforeMethod
    public void openPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC002() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.selectRegisterMenu();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setFirstName("Bhashitha");
        registerPage.setLastName("Ranchagoda");
        registerPage.setPhoneNumber("0716779857");
        registerPage.setEmail("bmr@gmail.com");
        registerPage.setCountry();
        registerPage.setUserName("bmr");
        registerPage.setPassword("123");
        registerPage.setConfirmPassword("123");

        Thread.sleep(5000);
        registerPage.submit();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        String actualText = registerSuccessPage.getRegisterSuccessText();
        Assert.assertTrue(actualText.contains("Dear"), "Registration Attempt failed");
        registerSuccessPage.clickSignIn();
        Thread.sleep(5000);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("bmr");
        loginPage.setPassword("123");
        Thread.sleep(2000);
        loginPage.submit();

        LoginSuccessPage loginSuccessPage = new LoginSuccessPage(driver);
        String actualLoginSuccessText = loginSuccessPage.getLoginSuccessText();
        Assert.assertTrue(actualLoginSuccessText.contains("Login Successfully"), "Login Attempt failed");
    }
}