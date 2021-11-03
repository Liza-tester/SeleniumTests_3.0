package steps;

import allPages.SelectProduct;
import ru.yandex.qatools.allure.annotations.Step;

public class SelectProductSteps {

    @Step("Выбран регион - {0}")
    public void stepSelectRegion(String value) {
        new SelectProduct().selectRegion(value);
    }

    @Step("Выбрана сумма - {0}")
    public void stepSelectSum(String value) {
        new SelectProduct().selectSum(value);
    }

    @Step("Нажата кнопка - Оформить")
    public void stepCheckout() {
        new SelectProduct().checkout();
    }

}