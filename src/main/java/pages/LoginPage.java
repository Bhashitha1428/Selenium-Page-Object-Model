package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    By userName_loc = By.xpath("//input[@name='userName']");
    By pwd_loc = By.xpath("//input[@name='password']");
    By submitBtn_loc= By.xpath("//input[@name='submit']");


    public void setUserName(String userName){
        driver.findElement(userName_loc).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(pwd_loc).sendKeys(password);
    }

    public void submit(){
        driver.findElement(submitBtn_loc).click();
    }



}
