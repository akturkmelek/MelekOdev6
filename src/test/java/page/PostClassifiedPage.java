package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PostClassifiedPage extends BasePage
{

    private Object jExecutor;
    PostClassifiedPage postClassifiedPage;

    public PostClassifiedPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(xpath = "//a[contains(text(),'Ücretsiz* İlan Ver')]")
    private WebElement postNewClassifiedButton;

    @FindBy(xpath="//h3[contains(text(),'Adım Adım Kategori Seç')]")
    private WebElement getChooseCategoryStepByStepText;

    @FindBy(css =".splash-price-history-icon.ng-scope")
    private WebElement clickSplashPriceHistoryButton;

    @FindBy(css="div.modern-category-item.ng-scope:nth-child(5)")
    private WebElement clickIndustrialAndHeavyEquipmentButton;

    @FindBy(css=".classified-from-text-input.ng-pristine")
    private WebElement classifiedTitleInput;

    @FindBy(css = "[name='Açıklama']")
    private WebElement classifiedDescriptionInput;

    @FindBy(css="input#addClassifiedPrice")
    private WebElement classifiedPriceInput;

    @FindBy(xpath="//option[contains(text(),'Bahçe Tipi')]")
    private WebElement classifiedSelectType;

    @FindBy(xpath="//option[contains(text(),'Kapalı Kabin')]")
    private WebElement classifiedCabinSelectType;

    @FindBy(css="[name='a82098']")
    private WebElement classifiedModelYearInput;

    @FindBy (xpath="//option[contains(text(),'6 İleri - 2 Geri')]")
    private WebElement classifiedGearSelectType;

    @FindBy (xpath="//option[contains(text(),'4x2')]")
    private WebElement classifiedTractionType;

    @FindBy(xpath="//option[contains(text(),'Var')]")
    private WebElement classifiedFrontLoaderBucket;

    @FindBy(xpath="//option[contains(text(),'Sıfır')]")
    private WebElement classifiedStatusType;

    @FindBy(css="[name='a104105']")
    private WebElement classifiedNumberOfCylinder;

    @FindBy(css="[name='a82100']")
    private WebElement classifiedWorkHourInput;

    @FindBy(css="[name='a82112']")
    private  WebElement classifiedMotorPowerInput;

    @FindBy(css="[name='a113754']")
    private  WebElement classifiedFrontTireInput;

    @FindBy(css="[name='a113755']")
    private WebElement classifiedRearTireInput;

    @FindBy(css=".sg-select.ng-not-empty.ng-dirty.ng-valid-parse.ng-valid.ng-valid-required.ng-touched:nth-child(2)")
    private WebElement classifiedTownSelect;

    @FindBy(css="p.dialog-buttons.centered.ng-scope > button.btn.btn-alternative:nth-child(2)")
    private WebElement classifiedDialogClosser;

    @FindBy(css = ".add-post-rules>label")
    private List<WebElement> classifiedRulesCheckBox;

    @FindBy(css=" div.progress.step2 ol:nth-child(1) li.done:nth-child(1) > a:nth-child(3)")
    private WebElement getCategorySelectionText;

    @FindBy(css="div.gmap div.map.ng-isolate-scope.active:nth-child(2) div.map-container:nth-child(1) div.gm-style div:nth-child(2) div:nth-child(1) div:nth-child(3) div:nth-child(2) > img:nth-child(1)")
    private WebElement selectLocationMap;
    @FindBy(css=".add-classified-submit.btn.btn-strong")
    private WebElement clickContinueButton2;


    public void clickPostNewClassifiedButton() {
        postNewClassifiedButton.click();
    }


    public void clickSplashPriceHistoryButton() {clickSplashPriceHistoryButton.click();}
    public void clickIndustrialAndHeavyEquipmentButton(){clickIndustrialAndHeavyEquipmentButton.click();}
    public void classifiedSelectType(){classifiedSelectType.click();}
    public void classifiedCabinSelectType(){classifiedCabinSelectType.click();}
    public void classifiedGearSelectType(){classifiedGearSelectType.click();}
    public void classifiedTractionType(){classifiedTractionType.click();}
    public void classifiedFrontLoaderBucket(){classifiedFrontLoaderBucket.click();}
    public void classifiedStatusType(){classifiedStatusType.click();}
    public void clickContinueButton2(){clickContinueButton2.click();}
    public void classifiedDialogClosser(){classifiedDialogClosser.click();}
    public String getCategorySelectionText(){getCategorySelectionText.getText();
        return getCategorySelectionText.getText();
    }


    public String getChooseCategoryStepByStepText(){getChooseCategoryStepByStepText.getText();
        return getChooseCategoryStepByStepText.getText();
    }


    public PostClassifiedPage fillClassifiedTitleInput(String classifiedTitle) {
        classifiedTitleInput.sendKeys(classifiedTitle);
        return this;
    }

    public PostClassifiedPage fillClassifiedDescriptionInput(String classifiedDescription) {
        classifiedDescriptionInput.sendKeys(classifiedDescription);
        return this;
    }

    public PostClassifiedPage fillClassifiedPriceInput(String classfiedPrice) {
        classifiedPriceInput.sendKeys(classfiedPrice);
        return this;
    }

    public PostClassifiedPage fillClassifiedModelYearInput(String classifiedModelYear) {
        classifiedModelYearInput.sendKeys(classifiedModelYear);
        return this;
    }

    public PostClassifiedPage fillClassifiedWorkHourInput(String classifiedWorkHour){
        classifiedWorkHourInput.sendKeys(classifiedWorkHour);
        return this;
    }

    public PostClassifiedPage fillClassifiedMotorPowerInput(String classifiedMotorPower){
        classifiedMotorPowerInput.sendKeys(classifiedMotorPower);
        return this;
    }

    public PostClassifiedPage fillClassifiedFrontTireInput(String classifiedFrontTire){
        classifiedFrontTireInput.sendKeys(classifiedFrontTire);
        return this;
    }

    public PostClassifiedPage fillClassifiedRearTireInput(String classifiedRearTire){
        classifiedRearTireInput.sendKeys(classifiedRearTire);
        return this;
    }


    public void clickTownAndQuarterSelect()
    {
        Select townSelect = new Select(driver.findElement(By.cssSelector("[name='town']")));
        townSelect.selectByVisibleText("Beşiktaş");

        Select quarterSelect = new Select(driver.findElement(By.cssSelector("[name='quarter']")));
        quarterSelect.selectByVisibleText("Abbasağa Mh.");
    }

    public void clickAgreementButton()
    {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("document.querySelector('#postRulesCheck').click()");

    }

    public  void selectCylinder(){

    Select cylinderSelect = new Select(driver.findElement(By.cssSelector("[name='a104105']")));
    cylinderSelect.selectByVisibleText("6");

    }

}

