package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class ClassifiedSuggestionPage extends BasePage
{
    ClassifiedSuggestionPage classifiedSuggestionPage;

    public ClassifiedSuggestionPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(css="div.paid-classified-suggestion-box.blue-box.paid-classified-confirm.ng-scope:nth-child(1) div.action > a.pc-btn")
    private WebElement clickClassifiedSuggestion;

    public void clickClassifiedSuggestion(){clickClassifiedSuggestion.click();}


}
