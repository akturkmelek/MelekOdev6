package page;

import extension.LogExtension;
import extension.TestExtension;
import extension.TestStatusExtension;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith({TestExtension.class, LogExtension.class, TestStatusExtension.class})
public class LoginTestClass extends BaseClass
{
    LoginPage loginpage;
    private static final Logger logger = LogManager.getLogger(LoginTestClass.class);


    @BeforeEach
    public void before()
    {
        loginpage = new LoginPage(driver);
    }

    @Tag("LOGİN_TESTS")
    @DisplayName("LOGİN PAGE TEST")
    @Description("Başarılı login")
    @Test
    public void login()
    {

        loginpage.clickLoginButton();
        loginpage.fillUsernameInput("esrakosee");
        loginpage.fillPasswordInput("password");
        loginpage.clickUserLoginSubmitButton();

        String myAccountTitle = loginpage.myAccountText();
        System.out.println(myAccountTitle);
        logger.info("Login başarılı bir şekilde gerçekleşti");

    }

    @Description("Password yanlış girildi")
    @Test
    public void loginFailed()
    {

        loginpage.clickLoginButton();
        loginpage.fillUsernameInput("esrakosee");
        loginpage.fillPasswordInput("password1");
        loginpage.clickUserLoginSubmitButton();

        String loginFailedText = loginpage.loginFailedText();
        System.out.println(loginFailedText);
        logger.info("Login failed");

    }

    @Description("Eposta yanlış girildi")
    @Test
    public void loginFailed2()
    {

        loginpage.clickLoginButton();
        loginpage.fillUsernameInput("esrakoseee");
        loginpage.fillPasswordInput("password");
        loginpage.clickUserLoginSubmitButton();

        String loginFailedText = loginpage.loginFailedText();
        System.out.println(loginFailedText);
        logger.info("Login failed");

    }

    @Description("E posta ve password boş girildi")
    @Test
    public void loginFailed3()
    {

        loginpage.clickLoginButton();
        loginpage.fillUsernameInput("");
        loginpage.fillPasswordInput("");
        loginpage.clickUserLoginSubmitButton();

        String loginFailed2Text = loginpage.loginFailed2Text();
        System.out.println(loginFailed2Text);

        String loginFailed3Text = loginpage.loginFailed3Text();
        System.out.println(loginFailed3Text);
        logger.info("Login failed");

    }


}
