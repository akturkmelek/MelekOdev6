package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class DopingPage extends BasePage
{
    DopingPage dopingPage;

    public DopingPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath="//body/div[1]/div[1]/div[2]/main[1]/div[1]/div[2]/section[5]/h2[2]/a[1]")
    private WebElement clickOtherDopingSelect;

    @FindBy(css=" li.thumb.promotion-10:nth-child(2) > span.ng-scope dropdown.ng-scope h3.title > label.ng-binding")
    private WebElement clickDopingSelect;

    @FindBy(css=" p.submit-promotion.ng-scope:nth-child(7) > button.btn")
    private WebElement clickGoOnButton2;

    public void clickOtherDopingSelect(){clickOtherDopingSelect.click();}

    public void clickDopingSelect(){clickDopingSelect.click();}

    public void clickGoOnButton2(){clickGoOnButton2.click();}


}

