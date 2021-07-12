package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class LoginPage {
    private BasePage browser;
    private By username = By.id("email");
    private By password = By.id("password");
    private By buttonLogin = By.id("SubmitLogin");
    private By feedbackOfLogIn = By.cssSelector(".alert > ol > li");

    public LoginPage(BasePage browser){
        this.browser = browser;
    }

    public LoginPage open (){
        browser.visit("?controller=authentication&back=my-account");
        return this;
    }

    public void ValidateCredentials(String email, String pass){
        browser.typeIn(email, username);
        browser.typeIn(pass, password);
        browser.click(buttonLogin);
    }

    public void RespondOfLogIn(String authentification){
        browser.getMessage(feedbackOfLogIn);
    }
}
