package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
    LoginPage loginPage;

    public LoginPage(WebDriver webDriver) {super(webDriver);}


    @FindBy(id = "secure-login")
    private WebElement loginButton;
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "userLoginSubmitButton")
    private WebElement clickUserLoginSubmitButton;

    @FindBy(className = "username-area")
    private WebElement myAccountText;

    @FindBy(xpath = "//span[contains(text(),'E-posta adresiniz, kullanıcı adınız veya şifreniz ')]")
    private WebElement loginFailedText;

    @FindBy(xpath = "//label[contains(text(),'E-posta adresinizi veya kullanıcı adınızı girin.')]")
    private WebElement loginFailed2Text;

    @FindBy(xpath = "    //label[contains(text(),'Şifrenizi girin.')]")
    private WebElement loginFailed3Text;



    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickUserLoginSubmitButton() {
        clickUserLoginSubmitButton.click();
    }

    public LoginPage fillUsernameInput(String username) {
        usernameInput.sendKeys(username);
        return this;
    }

    public LoginPage fillPasswordInput(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public String myAccountText(){
        return myAccountText.getText();
    }

    public String loginFailedText(){
        return loginFailedText.getText();
    }

    public String loginFailed2Text(){
        return loginFailed2Text.getText();
    }

    public String loginFailed3Text(){
        return loginFailed3Text.getText();
    }



}
