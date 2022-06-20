package ProjectTests;

import Base.Hooks;
import HelpPage.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest extends Hooks {

    public LoginPage loginPage;

    @Test
    public void testLoginPass(String email, String password){
        loginPage = new LoginPage(getDriver());
        loginPage.loginValidProcess(inputData);
   }

}


