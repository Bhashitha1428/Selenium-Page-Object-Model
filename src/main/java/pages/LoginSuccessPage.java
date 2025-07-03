package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class LoginSuccessPage {

    WebDriver driver;

    public LoginSuccessPage(WebDriver driver){
        this.driver=driver;
    }

    By successText_loc=By.xpath("//*[contains(text(),'Login Successfully')]");

    public String getLoginSuccessText(){
       return driver.findElement(successText_loc).getText();
    }
}
