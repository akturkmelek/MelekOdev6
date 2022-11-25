package page;

import extension.LogExtension;
import extension.TestExtension;
import extension.TestStatusExtension;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ExtendWith({TestExtension.class, LogExtension.class, TestStatusExtension.class})
public class SearchResultTestClass extends BaseClass {

    HomePage homePage;
    CategoryAutomobilePage categoryAutomobilePage;
    SearchResultPage searchResultPage;
    ClassifiedDetailPage classifiedDetailPage;

    private static final Logger logger = LogManager.getLogger(SearchResultTestClass.class);


    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        categoryAutomobilePage = new CategoryAutomobilePage(driver);
        searchResultPage = new SearchResultPage(driver);
        classifiedDetailPage = new ClassifiedDetailPage(driver);
    }

    @Tag("SEARCH_TESTS")
    @DisplayName("SEARCH TEST")
    @Description("Arama Sonuç Sayfası Kontrolü")
    @Test
    public void test1() {
        homePage.clickAutomobile();
        categoryAutomobilePage.clickAllClassifiedLink();

        Assertions.assertTrue(searchResultPage.getClassifiedSize() > 0);

        String title = searchResultPage.getFirstClassifiedTitle();
        String KM = searchResultPage.getFirstClassifiedKM();
        String price = searchResultPage.getFirstClassifiedPrice();
        String text = searchResultPage.allClassifiedsText();
        String sahibinden = searchResultPage.sahibindenText();
        String gallery = searchResultPage.galleryText();
        String officialseller = searchResultPage.officialSellerText();


        System.out.println(title);
        System.out.println(KM);
        System.out.println(price);
        System.out.println(text);
        System.out.println(sahibinden);
        System.out.println(gallery);
        System.out.println(officialseller);


        searchResultPage.clickFirstClassified();

        String classifiedTitle = classifiedDetailPage.getClassifiedTitle();

        Assertions.assertEquals(title, classifiedTitle);

        String allClassifiedsText = new String();
        String sahibindenText = new String();
        String gallerryText = new String();
        String officialSellerText = new String();
        String classifiedTitleName = new String();

        Assertions.assertAll
                (
                        () -> Assertions.assertEquals("Tüm İlanlar", allClassifiedsText),
                        () -> Assertions.assertEquals("Sahibinden", sahibindenText),
                        () -> Assertions.assertEquals("Galeriden", gallerryText),
                        () -> Assertions.assertEquals("Yetkili Bayiden", officialSellerText)

                );

        String URL = driver.getCurrentUrl();
        String classifieldId = findValue("#classifiedId", "getText", driver);
        Assertions.assertTrue(URL.contains(classifieldId));
        logger.info("İlan detay sayfasının urldeki ilan no ile ilan detaydaki ilan no'nun aynı olduğu görüldü");

        String classifiedInfoListText = driver.findElement(By.xpath("//ul[@class='classifiedInfoList']/li[5]")).getText();
        logger.info(classifiedInfoListText);
    }

    private static String findValue(String css, String type, WebDriver driver)
    {
        WebElement a = driver.findElement(By.cssSelector(css));

        if (type == "getText")
        {
            return (a.getText());
        }
        return (a.getAttribute("title"));
}}
