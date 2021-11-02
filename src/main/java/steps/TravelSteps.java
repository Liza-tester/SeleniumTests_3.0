package steps;

import allPages.TravelPage;
import ru.yandex.qatools.allure.annotations.Step;
import org.junit.Assert;

public class TravelSteps extends BaseSteps{

    @Step("Проверен заголовок - Страхование путешественников")
    public void stepCheckTitle(){
        Assert.assertEquals("Страхование путешественников", new TravelPage(driver).getTitle());
    }

    @Step("Нажата кнопка - Оформить онлайн")
            public void stepCheckoutOnline(){
        new TravelPage(driver).checkoutOnline();
    }

    @Step("Нажата кнопка - Оформить на сайте")
            public void stepCheckoutOnWebsite(){
        new TravelPage(driver).checkoutOnWebsite();
    }
}
