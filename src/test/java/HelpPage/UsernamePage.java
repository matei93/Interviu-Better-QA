package HelpPage;

import Base.Hooks;
import HelpMethods.ElementMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class UsernamePage extends Hooks {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public LoginPage loginPage;

    public UsernamePage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement enterEmail;
    @FindBy(xpath= "//input[@id='ussrname']")
    public WebElement enterUsername;


    public void fillEmail(String value){

        elementMethods.fillElement(enterEmail, value);
    }

    public void fillUserName(String value) {

        elementMethods.fillElement(enterUsername, value);
    }

    public void userNameCharactersLimit(HashMap<String, String> inputData){

        fillEmail(inputData.get("email"));
        fillUserName(inputData.get("username"));

    }

    public void userNameSpecialCharacters(HashMap<String, String> inputData){

        fillEmail(inputData.get("email"));
        fillUserName(inputData.get("username2"));

    }

}
