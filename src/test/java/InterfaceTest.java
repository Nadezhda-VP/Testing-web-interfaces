import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InterfaceTest {
    @Test
    public void testValid1() {
        open("http://localhost:9999/");
        $("[data-test-id ='name'] input").setValue("Пак Иван");
        $("[data-test-id ='phone'] input").setValue("+79156471826");
        $("[data-test-id ='agreement']").click();
        $(".button__content").click();
        $("[data-test-id='order-success']").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
