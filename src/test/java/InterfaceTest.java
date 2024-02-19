import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterfaceTest {
    // private WebDriver driver;

//    @BeforeAll
//    public static void setupAll() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    void setUp() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
//        driver.get("http://localhost:9999/");
//    }
//
//    @AfterEach
//    void tearDown() {
//        driver.quit();
//        driver = null;
//    }

    @Test
    public void testValid1() {
        open("http://localhost:9999/");
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$("[data-test-id ='name'] input").setValue("Пак Иван");
        form.$("[data-test-id ='phone'] input").setValue("+79156471826");
        form.$("[data-test-id ='agreement']").click();
        form.$(".button__content").click();
        $("[data-test-id='order-success']").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

//        driver.findElement(By.cssSelector("[data-test-id ='name'] input")).sendKeys("Пак Иван");
//        driver.findElement(By.cssSelector("[data-test-id ='phone'] input")).sendKeys("+79156471826");
//        driver.findElement(By.cssSelector("[data-test-id ='agreement']")).click();
//        driver.findElement(By.className("button")).click();
//        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
//        String actual = driver.findElement(By.cssSelector("[data-test-id = order-success]")).getText().trim();
//        assertEquals(expected, actual);

    }

}
