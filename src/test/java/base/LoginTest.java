package base;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {

    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeMethod
    public void setPages(){
        homePage = pages.getHomePage();
        loginPage = pages.getLoginPage();


    }

    @Test
    public void LogInWithValidCredentials(){
        loginPage.open().ValidateCredentials("roni_cost@example.com", "roni_cost3@example.com");
        assertTrue.equal(loginPage.RespondOfLogIn("Authentication failed."));
        System.out.println("Successfully Login test is done!");
    }
}
