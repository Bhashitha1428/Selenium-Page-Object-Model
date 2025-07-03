package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageUpdated {

    WebDriver driver;

    public RegisterPageUpdated(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName_ele;
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName_ele;
    @FindBy(xpath = "//input[@name='phone']")
    WebElement phone_ele;
    @FindBy(xpath = "//input[@id='userName']")
    WebElement userName_ele;
    @FindBy(xpath = "//select[@name='country']")
    WebElement country_ele;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email_ele;
    @FindBy(xpath = "//input[@name='password']")
    WebElement pwd_ele;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    WebElement confirmPwd_ele;
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitbtn_ele;


    public void setFirstName(String firstName) {
        firstName_ele.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastName_ele.sendKeys(lastName);
    }

    public void setPhoneNumber(String phoneNumber) {
        phone_ele.sendKeys(phoneNumber);
    }

    public void setUserName(String userName) {
        userName_ele.sendKeys(userName);
    }

    public void setCountry() {
        Select countryList = new Select(country_ele);
        countryList.selectByIndex(5);
    }

    public void setEmail(String email) {
        email_ele.sendKeys(email);
    }

    public void setPassword(String password) {
        pwd_ele.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmPwd_ele.sendKeys(confirmPassword);
    }

    public void submit() {
        submitbtn_ele.click();
    }


}
