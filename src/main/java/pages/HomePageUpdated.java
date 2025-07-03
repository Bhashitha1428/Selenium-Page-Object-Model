package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageUpdated {

    WebDriver driver;

    public HomePageUpdated(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
//      1 st way
//    @FindBy(how= How.LINK_TEXT,using = "REGISTER")
//    WebElement registerBtn;

    //2nd way
    @FindBy(linkText = "REGISTER")
    WebElement registerBtn;

    public void selectRegisterMenu() {
        registerBtn.click();
    }
}
