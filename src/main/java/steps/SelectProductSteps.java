package steps;

import allPages.SelectProduct;
import ru.yandex.qatools.allure.annotations.Step;

public class SelectProductSteps extends BaseSteps{

    @Step("Выбран регион - {0}")
    public void stepSelectRegion(String value){
        new SelectProduct(driver).selectRegion(value);
    }
    @Step("Выбрана сумма - {0}")
    public void stepSelectSum(String value){
        new SelectProduct(driver).selectSum(value);
    }
    @Step("Нажата кнопка - Оформить")
    public void stepCheckout(){
        new SelectProduct(driver).checkout();
    }

}