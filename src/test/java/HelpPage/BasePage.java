package HelpPage;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public BasePage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }
}
