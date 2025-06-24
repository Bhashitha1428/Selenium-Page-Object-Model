package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class HomePage {


    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=  driver;
    }

    By registerBtnLoc=By.linkText("REGISTER");
    public void selectRegisterMenu(){
        driver.findElement(registerBtnLoc).click();
    }
}
