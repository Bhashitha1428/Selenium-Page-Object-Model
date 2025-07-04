package pages;

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


    public RegisterPageUpdated setFirstName(String firstName) {
        firstName_ele.sendKeys(firstName);
        return this;
    }

    public RegisterPageUpdated setLastName(String lastName) {
        lastName_ele.sendKeys(lastName);
        return this;
    }

    public RegisterPageUpdated setPhoneNumber(String phoneNumber) {
        phone_ele.sendKeys(phoneNumber);
        return this;
    }

    public RegisterPageUpdated setUserName(String userName) {
        userName_ele.sendKeys(userName);
        return this;
    }

    public RegisterPageUpdated setCountry() {
        Select countryList = new Select(country_ele);
        countryList.selectByIndex(5);
        return this;
    }

    public RegisterPageUpdated setEmail(String email) {
        email_ele.sendKeys(email);
        return this;
    }

    public RegisterPageUpdated setPassword(String password) {
        pwd_ele.sendKeys(password);
        return this;
    }

    public RegisterPageUpdated setConfirmPassword(String confirmPassword) {
        confirmPwd_ele.sendKeys(confirmPassword);
        return this;
    }

    public RegisterSuccessPageUpdated submit() throws InterruptedException {
        Thread.sleep(5000);
        submitbtn_ele.click();
        return new RegisterSuccessPageUpdated(driver);
    }


}
