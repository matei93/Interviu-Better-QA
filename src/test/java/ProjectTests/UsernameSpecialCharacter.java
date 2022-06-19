package ProjectTests;

import Base.Hooks;
import HelpPage.LoginPage;
import HelpPage.UsernamePage;
import org.junit.Test;

import static java.sql.DriverManager.getDriver;

public class UsernameSpecialCharacter extends Hooks {

    public UsernamePage userName;
    public LoginPage loginPage;

    @Test

    public void testCharacterLimit() {

        loginPage = new LoginPage(getDriver());
        userName = new UsernamePage(getDriver());

        loginPage.loginValidProcess(inputData);
        userName.userNameSpecialCharacters(inputData);
    }
}

