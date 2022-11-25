package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class ClassifiedPreviewPage extends BasePage
{
    ClassifiedPreviewPage classifiedPreviewPage;

    public ClassifiedPreviewPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickGoOnButton(){clickGoOnButton.click();}

    @FindBy(css="body.safe.end.js-enabled:nth-child(2)> div.container:nth-child(1)> div.main-view div.ng-scope:nth-child(3)> main:nth-child(1)> div.add-classified.ng-scope div.ng-scope> div.classified-preview-buttons.preview-btn-top.ng-scope:nth-child(3) > button.btn:nth-child(2)")
    private WebElement clickGoOnButton;



}

