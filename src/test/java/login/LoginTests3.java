package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTests3 extends BaseTests {
    @Test
    public void testSuccessfulLogin() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnSignupLoginLink();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,
                dataModel().Login.ValidCredentials.Password);
    }
    @Test
    public void testSuccessfulLogin2() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnSignupLoginLink();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,
                dataModel().Login.ValidCredentials.Password);
    }
    @Test
    public void testSuccessfulLogin3() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnSignupLoginLink();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,
                dataModel().Login.ValidCredentials.Password);
    }
}
