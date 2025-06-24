package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccessPage;

import java.time.Duration;

public class TC001_RegisterUserTest {

    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

   @Test
    public void TC001() throws InterruptedException {

        HomePage homePage=new HomePage(driver);
        homePage.selectRegisterMenu();

       RegisterPage registerPage=new RegisterPage(driver);
       registerPage.setFirstName("BMR");
       registerPage.setLastName("Ranchagoda");
       registerPage.setPhoneNumber("0716779857");
       registerPage.setEmail("bmr@gmail.com");
       registerPage.setCountry();
       registerPage.setUserName("bmr");
       registerPage.setPassword("123456");
       registerPage.setConfirmPassword("123456");

       Thread.sleep(5000);
       registerPage.submit();

       RegisterSuccessPage registerSuccessPage=new RegisterSuccessPage(driver);
       String actualText=registerSuccessPage.getRegisterSuccessText();
       Assert.assertTrue(actualText.contains("Dear"),"Registration Attempt failed");

    }

}
