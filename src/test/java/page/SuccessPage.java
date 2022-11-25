package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPage extends BasePage
{
    public SuccessPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    @FindBy(xpath = "//p[contains(text(),'Ödeme işleminiz başarıyla tamamlanmıştır.')]")
    private WebElement successText;

    public String getTextSuccessPage()
    {
        return successText.getText();
    }

}