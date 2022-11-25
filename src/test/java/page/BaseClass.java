package page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class BaseClass
{

    WebDriver driver;
    WebDriverWait wait;
    private static final Logger logger = LogManager.getLogger(BaseClass.class);

    @BeforeAll
    public static void beforeAll()
    {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeTest()
    {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.MINUTES);

        driver.get("http://sahibinden.com/");

        List<Cookie> cookieList = new ArrayList<>();
        cookieList.add(new Cookie("testBox", "165", ".sahibinden.com", "/", null));
        cookieList.add(new Cookie("tbSite", "x", ".sahibinden.com", "/", null));
        cookieList.forEach(cookie -> driver.manage().addCookie(cookie));

        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

        LocalStorage localStorage = ((WebStorage) driver).getLocalStorage();
        localStorage.setItem("yt-remote-device-id",
                "{\"data\":\"95a35c11-7114-4936-917f-d98613c47389\",\"expiration\":1699164221982,\"creation\":1667628221982}");

        SessionStorage sessionStorage = ((WebStorage) driver).getSessionStorage();
        sessionStorage.setItem("yt-remote-session-app", "{\"data\":\"youtube-desktop\",\"creation\":1667628222564}");

        LocalStorage localStorageOnurBuldu = ((WebStorage) driver).getLocalStorage();
        localStorageOnurBuldu.setItem("feature_discovery_data",
                "{\"add-to-favorites\":{\"count\":1,\"displayedAt\":1666694107010},\"extended\":true}");

        SessionStorage sessionStorageOnurBuldu = ((WebStorage) driver).getSessionStorage();
        sessionStorageOnurBuldu.setItem("feature_discovery_displayed", "true");


        wait.until(visibilityOfElementLocated(By.cssSelector(".onetrust-close-btn-handler"))).click();

        logger.info("Testboxa baglanıldı");

    }

    @AfterEach
    public void afterTest()
    {
        driver.quit();
        logger.info("Chromedriver kapandı");
    }

}
