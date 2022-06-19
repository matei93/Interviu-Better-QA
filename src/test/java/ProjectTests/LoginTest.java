package ProjectTests;

import Base.Hooks;
import HelpPage.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest extends Hooks {

    public LoginPage loginPage;

    @Test
    public void testLoginPass(){
        loginPage = new LoginPage(getDriver());
        loginPage.loginValidProcess(inputData);


   }
    //public void testLoginNotPass(){
        //loginPage = new LoginPage(getDriver());
        //WebDriverWait Wait = new WebDriverWait(loginPage.driver, Duration.ofSeconds(5));

        //loginPage.loginInvalidProcess(inputData);

   // }

}


