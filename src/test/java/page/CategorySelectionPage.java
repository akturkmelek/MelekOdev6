package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategorySelectionPage extends BasePage
{
    CategorySelectionPage categorySelectionPage;

    public CategorySelectionPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(xpath="//span[contains(text(),'Tarım Makineleri')]")
    private WebElement clickAgriculturalMachineryButton;

    @FindBy(xpath="//span[contains(text(),'Traktör')]")
    private WebElement clickTractorButton;

    @FindBy(xpath="//span[contains(text(),'Agrifarm')]")
    private WebElement clickAgrifarmButton;

    @FindBy(css="div.process-done.animation-done-scroll.ng-scope:nth-child(6) > button.btn:nth-child(3)")
    private WebElement clickContinueButton;

    public void clickAgriculturalMachineryButton(){clickAgriculturalMachineryButton.click();}

    public void clickTractorButton(){clickTractorButton.click();}

    public void clickAgrifarmButton(){clickAgrifarmButton.click();}

    public void clickContinueButton(){clickContinueButton.click();}



}