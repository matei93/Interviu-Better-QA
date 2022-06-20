package HelpPage;

import Base.Hooks;
import HelpMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

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
    @FindBy(css = "#psw")
    public WebElement password;


    public void fillEmail(String value){

        elementMethods.fillElement(enterEmail, value);
    }

    public int fillUserName(String value) {

        elementMethods.fillElement(enterUsername, value);
        return 0;
    }

    public void userNameCharactersLimit(HashMap<String, String> inputData){

        fillEmail(inputData.get("email"));
        fillUserName(inputData.get("username"));

    }

    public void userNameSpecialCharacters(HashMap<String, String> inputData){

        fillEmail(inputData.get("email"));
        fillUserName(inputData.get("username2"));

    }

    public void specialCharaterValidation() {
        try {
            driver.findElement(By.xpath("//*[contains(text(),'|')]"));
            System.out.println("The test not passed");

        }
        catch (Exception e) {
            assertTrue("The test passed", false);
        }
    }
    public void numberOflCharaterValidation() {
        try {
            driver.findElement(By.id("psw"));
            System.out.println("The test not passed, an error message should have appeared that the character limit had been exceeded");

        }
        catch (Exception e) {
            assertTrue("The test passed", false);
        }
    }

    public void clickPasswordField(){
        elementMethods.clickElement(password);
    }

}
