package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

    public HomePage(WebDriver webDriver)
    {
        super(webDriver);
    }

    @FindBy(css = "[title='Otomobil']")
    public WebElement automobile;

    public void clickAutomobile()
    {
        automobile.click();
    }
}
