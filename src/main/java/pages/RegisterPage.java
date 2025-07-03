package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName_loc = By.xpath("//input[@name='firstName']");
    By latsName_loc = By.xpath("//input[@name='lastName']");
    By phone_loc = By.xpath("//input[@name='phone']");
    By userName_loc = By.xpath("//input[@id='userName']");
    By country_loc = By.xpath("//select[@name='country']");
    By email_loc = By.xpath("//input[@id='email']");
    By pwd_loc = By.xpath("//input[@name='password']");
    By confirmPwd_loc = By.xpath("//input[@name='confirmPassword']");
    By submit_loc = By.xpath("//input[@name='submit']");



    public void setFirstName(String firstName) {
        driver.findElement(firstName_loc).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(latsName_loc).sendKeys(lastName);
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phone_loc).sendKeys(phoneNumber);
    }

    public void setUserName(String userName) {
        driver.findElement(userName_loc).sendKeys(userName);
    }

    public void setCountry() {
        WebElement countryDropdown = driver.findElement(country_loc);
        Select countryList = new Select(countryDropdown);
        countryList.selectByIndex(5);
    }

    public void setEmail(String email) {
        driver.findElement(email_loc).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(pwd_loc).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPwd_loc).sendKeys(confirmPassword);
    }

    public void submit() {
        driver.findElement(submit_loc).click();
    }


}
