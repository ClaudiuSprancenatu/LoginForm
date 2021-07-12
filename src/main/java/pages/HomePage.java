package pages;

import framework.BasePage;

public class HomePage {
    private BasePage browser;

    public HomePage(BasePage browser){
        this.browser = browser;
    }

    public LoginPage clickonSignIn(){
        browser.clickLink("Sign in");
        return new LoginPage(browser);
    }
}
