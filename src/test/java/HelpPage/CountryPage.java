package HelpPage;

import Base.Hooks;
import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class CountryPage  extends Hooks {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public CountryPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "psw")
    public WebElement password2;
    @FindBy(id = "psw-repeat")
    public WebElement repeatPassword;
    @FindBy(className = "registerbtn")
    public WebElement registerButton;

    public void fillPassword2(String value) {

        elementMethods.fillElement(password2, value);
    }

    public void fillRepeatPassword(String value) {

        elementMethods.fillElement(repeatPassword, value);
    }

    public void clickRegister() {

        elementMethods.clickElement(registerButton);
    }

    public void countryNotMandatory(HashMap<String, String> inputData) {
        fillPassword2(inputData.get("password2"));
        fillRepeatPassword(inputData.get("repeatPassword"));
        clickRegister();
    }
}

