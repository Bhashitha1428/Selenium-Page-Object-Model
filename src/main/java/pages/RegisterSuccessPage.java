package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPage {
    WebDriver driver;

    public RegisterSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    By successText_loc = By.xpath("//b[contains(text(),'Dear')]");
    By signIn_loc = By.xpath("//a[normalize-space()='sign-in']");

    public String getRegisterSuccessText() {
        String successText = driver.findElement(successText_loc).getText();
        return successText;

    }

    public void clickSignIn() {
        driver.findElement(signIn_loc).click();
    }
}
