package HelpPage;

import HelpMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class LoginPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "pwbox-4001")
    public WebElement password;
    @FindBy(xpath = "//input[@name='Submit']")
    public WebElement enter;

    public void fillPassword(String value) {

        elementMethods.fillElement(password, value);
    }

    public void clickLogIn() {

        elementMethods.clickElement(enter);
    }

    public void loginValidProcess(HashMap<String, String> inputData) {
        fillPassword(inputData.get("password"));
        clickLogIn();
    }

    public void loginInvalidProcess(HashMap<String, String> inputData){
        fillPassword(inputData.get("password2"));
        clickLogIn();
    }
}
