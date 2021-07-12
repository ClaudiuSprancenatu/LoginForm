package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class LoginPage {
    private BasePage browser;
    private By username = By.id("email");
    private By password = By.id("password");
    private By buttonLogin = By.id("SubmitLogin");

    public void ValidateCredentials(String email, String pass){
        browser.typeIn(email, username);
        browser.typeIn(pass, password);
        browser.click(buttonLogin);
    }
}
