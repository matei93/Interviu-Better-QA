package ProjectTests;

import Base.Hooks;
import HelpMethods.ElementMethods;
import HelpPage.LoginPage;
import HelpPage.UsernamePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsernameCharactersLimit extends Hooks{

    public UsernamePage userName;
    public LoginPage loginPage;

    @Test

    public void testCharacterLimit(){

        loginPage = new LoginPage(getDriver());
        userName = new UsernamePage(getDriver());

        loginPage.loginValidProcess(inputData);
        userName.userNameSpecialCharacters(inputData);







    }
}
