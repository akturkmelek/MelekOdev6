package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class PaymentPage extends BasePage
{
    PaymentPage paymentPage;

    public PaymentPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id="cardNo")
    private static WebElement creditCardNoInput;

    @FindBy(id="cvc2")
    private WebElement creditCardCvc2Input;

    @FindBy(id="makePaymentFromBasket")
    private WebElement clickMakePaymentFromBasket;


    public PaymentPage fillCreditCardNoInput(String creditCardNo){
        creditCardNoInput.sendKeys(creditCardNo);
        return this;
    }

    public PaymentPage fillCvcInput(String cvcNo){
        creditCardCvc2Input.sendKeys(cvcNo);
        return this;
    }


    public void selectExpireMonthAndYear() {
    Select expireMonthSelect = new Select(driver.findElement(By.cssSelector("[name='expireMonth']")));
        expireMonthSelect.selectByVisibleText("12");

    Select expireYearSelect = new Select(driver.findElement(By.cssSelector("[name='expireYear']")));
        expireYearSelect.selectByVisibleText("2030");
    }

    public void fillCvcInput()
    {
        paymentPage.fillCvcInput("000");
    }

    public void saleAgreement(){

    JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("document.querySelector('#saleAgreementAcceptedLabel').click()");
    }

    public  void clickMakePaymentFromBasket(){clickMakePaymentFromBasket.click();}


}

