package functions;

import org.openqa.selenium.WebDriver;
import pages.HomePageUpdated;
import pages.RegisterPageUpdated;
import pages.RegisterSuccessPageUpdated;

public class NewtoursCommonFunctions_MethodChaining {

    WebDriver driver;

    public NewtoursCommonFunctions_MethodChaining(WebDriver driver) {
        this.driver = driver;
    }


    public String registerUser(String fName, String lName, String phone, String email, String userName, String pwd,
                               String confirmPwd) throws InterruptedException {
        HomePageUpdated homePage = new HomePageUpdated(driver);
        return homePage.selectRegisterMenu()
                .setFirstName(fName)
                .setLastName(lName)
                .setPhoneNumber(phone)
                .setEmail(email)
                .setCountry()
                .setUserName(userName)
                .setPassword(pwd)
                .setConfirmPassword(confirmPwd)
                .submit()
                .getRegisterSuccessText();


    }

}
