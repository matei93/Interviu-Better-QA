package ProjectTests;

import Base.Hooks;
import HelpPage.CountryPage;
import HelpPage.LoginPage;
import HelpPage.UsernamePage;
import org.junit.Test;

public class CountryNotMandatory extends Hooks {

    public UsernamePage userName;
    public LoginPage loginPage;
    public CountryPage countryPage;

    @Test

    public void testCharacterLimit() {

        loginPage = new LoginPage(getDriver());
        userName = new UsernamePage(getDriver());
        countryPage = new CountryPage(getDriver());
        loginPage.loginValidProcess(inputData);
        userName.userNameSpecialCharacters(inputData);
        countryPage.countryField();
        countryPage.countryNotMandatory(inputData);

    }
}
