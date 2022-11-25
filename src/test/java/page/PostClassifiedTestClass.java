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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.io.File;

@ExtendWith({TestExtension.class, LogExtension.class, TestStatusExtension.class})
public class PostClassifiedTestClass extends BaseClass
{
    LoginPage loginPage;
    PostClassifiedPage postClassifiedPage;

    CategorySelectionPage categorySelectionPage;
    ClassifiedSuggestionPage classifiedSuggestionPage;
    ClassifiedPreviewPage classifiedPreviewPage;
    DopingPage dopingPage;
    PaymentPage paymentPage;

    SuccessPage successPage;

    private static final Logger logger = LogManager.getLogger(PostClassifiedTestClass.class);

    @BeforeEach
    public void before()
    {
        postClassifiedPage = new PostClassifiedPage(driver);
        loginPage = new LoginPage(driver);
        categorySelectionPage = new CategorySelectionPage(driver);
        classifiedSuggestionPage = new ClassifiedSuggestionPage(driver);
        classifiedPreviewPage = new ClassifiedPreviewPage(driver);
        dopingPage = new DopingPage(driver);
        paymentPage = new PaymentPage(driver);
        successPage = new SuccessPage(driver);
    }


    @Tag("CLASSİFİED_TESTS")
    @DisplayName("CLASSİFİED TEST")
    @Description("İş makineleri & Sanayi ilanı verme")
    @Test
    public void postClassifiedPage()
    {
        try
        {

            loginPage.clickLoginButton();
            loginPage.fillUsernameInput("esrakosee");
            loginPage.fillPasswordInput("password");
            loginPage.clickUserLoginSubmitButton();
            logger.info("Login başarılı bir şekilde gerçekleşti");

            Thread.sleep(1000);

            // postClassifiedPage.clickSplashPriceHistoryButton(); - bazen tblerde geliyor bu splash geliyor atlatmak gerekiyor, gerekebilir diye ekledim
            postClassifiedPage.clickPostNewClassifiedButton();

            String stepByStepText = postClassifiedPage.getChooseCategoryStepByStepText();
            System.out.println(stepByStepText);
            postClassifiedPage.clickIndustrialAndHeavyEquipmentButton();
            postClassifiedPage.classifiedDialogClosser(); //- birkaç kez çalıştırılınca ilanı draft olarak kaydettiği için bununla atlatmak gerekiyor

            categorySelectionPage.clickAgriculturalMachineryButton();
            categorySelectionPage.clickTractorButton();
            categorySelectionPage.clickAgrifarmButton();
            categorySelectionPage.clickContinueButton();
            logger.info("Kategori seçimi yapıldı");

            String title = postClassifiedPage.getCategorySelectionText();
            System.out.println(title);
            postClassifiedPage.fillClassifiedTitleInput("Melek Aktürk - Test Otomasyon Homework 6");
            postClassifiedPage.fillClassifiedDescriptionInput("Bütün emekleriniz için teşekkür ederimmmm iyi ki varsınız <3");
            postClassifiedPage.fillClassifiedPriceInput("5000");
            postClassifiedPage.classifiedSelectType();
            postClassifiedPage.classifiedCabinSelectType();
            postClassifiedPage.fillClassifiedModelYearInput("2022");
            postClassifiedPage.classifiedGearSelectType();
            postClassifiedPage.fillClassifiedMotorPowerInput("30");
            postClassifiedPage.classifiedTractionType();
            postClassifiedPage.selectCylinder();
            postClassifiedPage.fillClassifiedWorkHourInput("8");
            postClassifiedPage.classifiedFrontLoaderBucket();
            postClassifiedPage.fillClassifiedFrontTireInput("10");
            postClassifiedPage.fillClassifiedRearTireInput("20");
            postClassifiedPage.classifiedStatusType();
            postClassifiedPage.clickTownAndQuarterSelect();
            postClassifiedPage.clickAgreementButton();
            postClassifiedPage.clickContinueButton2();
            logger.info("İlanın kriterleri girildi");

            classifiedPreviewPage.clickGoOnButton(); // - debugda çalıştırınca tıklatırken normal çalıştırınca bulamıyor gibi davranıp tıklatmıyor. (devam et butonlarda)
            logger.info("Önizleme sayfasına tıklanıldı");

            //Thread.sleep(5000); devam et butonu bulamadığı için süre de koydum ama bulamıyor, debugda buluyor.

            classifiedSuggestionPage.clickClassifiedSuggestion();
            logger.info("İlan teklifleri sayfasına tıklanıldı");


            dopingPage.clickOtherDopingSelect();
            dopingPage.clickDopingSelect();
            dopingPage.clickGoOnButton2();
            logger.info("Doping seçimi yapıldı");


            paymentPage.fillCreditCardNoInput("4355084355084358");
            paymentPage.selectExpireMonthAndYear();
            paymentPage.fillCvcInput();
            paymentPage.saleAgreement();
            paymentPage.clickMakePaymentFromBasket();
            logger.info("Ödeme İşlemi gerçekleştirildi");

            successPage.getTextSuccessPage();
            logger.info("Ödeme işleminiz başarıyla tamamlanmıştır. texti görüldü");

        }
        catch (Exception exception)
        {
            logger.info("Test fail etti");
            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            logger.info(imageFile.getPath());
        }

    }
}
