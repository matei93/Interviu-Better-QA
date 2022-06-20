package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element){
        waitElement(element);
        element.click();
    }


    public void waitElement(WebElement element){
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void fillElement(WebElement element, String value){
        waitElement(element);
        element.sendKeys(value);
    }


    public void moveElement(WebElement element){

        waitElement(element);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void selectElementByText(WebElement element, String value){
        Select yearSelect = new Select(element);
        yearSelect.selectByVisibleText(value);
    }

    public void selectElementByValue(WebElement element, String value) {
        Select yearSelect = new Select(element);
        yearSelect.selectByValue(value);
    }


}
