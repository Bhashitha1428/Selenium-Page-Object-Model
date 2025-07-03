package testcases;

import functions.NewtoursCommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC001_RegisterUserTestUpdated {

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
       NewtoursCommonFunctions newtoursCommonFunctions=new NewtoursCommonFunctions(driver);
       String actualText=newtoursCommonFunctions.registerUser("Bhashitha","Ranchagoda","0716978579",
               "abc@gmail.com","bmr","12345","12345");
       Assert.assertTrue(actualText.contains("Dear"), "Registration Attempt failed");

    }

    @AfterMethod
    public void closePage(){
        driver.quit();
    }
}
