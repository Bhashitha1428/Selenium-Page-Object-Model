package functions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePageUpdated;
import pages.RegisterPageUpdated;
import pages.RegisterSuccessPageUpdated;

public class NewtoursCommonFunctions {

    WebDriver driver;

    public NewtoursCommonFunctions(WebDriver driver) {
        this.driver = driver;
    }


    public String registerUser(String fName, String lName, String phone, String email, String userName, String pwd,
                               String confirmPwd) throws InterruptedException {
        HomePageUpdated homePage = new HomePageUpdated(driver);
        homePage.selectRegisterMenu();

        RegisterPageUpdated registerPage = new RegisterPageUpdated(driver);
        registerPage.setFirstName(fName);
        registerPage.setLastName(lName);
        registerPage.setPhoneNumber(phone);
        registerPage.setEmail(email);
        registerPage.setCountry();
        registerPage.setUserName(userName);
        registerPage.setPassword(pwd);
        registerPage.setConfirmPassword(confirmPwd);

        Thread.sleep(5000);
        registerPage.submit();

        RegisterSuccessPageUpdated registerSuccessPage = new RegisterSuccessPageUpdated(driver);
        return registerSuccessPage.getRegisterSuccessText();


    }

}
