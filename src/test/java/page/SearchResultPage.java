package page;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage
{

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = ".searchResultsRowClass > tr > td:nth-child(1)")
    public List<WebElement> searchResultClassifieds;

    @FindBy(css = ".searchResultsRowClass > tr > td.searchResultsTitleValue")
    public List<WebElement> classifiedsTitle;

    @FindBy(css = ".searchResultsRowClass > tr > td:nth-child(7)")
    public List<WebElement> classifiedsKM;

    @FindBy(css = ".searchResultsRowClass > tr > td.searchResultsPriceValue")
    public List<WebElement> classifiedsPrice;

    @FindBy(css = "a.phdef[title='Tüm İlanlar']")
    public WebElement allClassifiedsText;

    @FindBy(css = "a.phdef[title='Sahibinden']")
    public WebElement sahibindenText;

    @FindBy(css = "a.phdef[title='Galeriden']")
    public WebElement galleryText;

    @FindBy(css = "a.phdef[title='Yetkili Bayiden']")
    public WebElement officialSellerText;


    public Integer getClassifiedSize() {
        return searchResultClassifieds.size();
    }

    public void clickFirstClassified() {
        searchResultClassifieds.get(0).click();
    }

    public String getFirstClassifiedTitle() {
        return classifiedsTitle.get(0).getText();
    }

    public String getFirstClassifiedKM(){
        return classifiedsKM.get(0).getText();
    }

    public String getFirstClassifiedPrice(){
        return classifiedsPrice.get(0).getText();
    }

    public String allClassifiedsText(){
        return allClassifiedsText.getText();
    }

    public String sahibindenText(){
        return sahibindenText.getText();
    }

    public String galleryText(){
        return galleryText.getText();
    }

    public String officialSellerText(){return officialSellerText.getText();}

}
