package steps;

import allPages.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

public class RegistrationSteps extends BaseSteps {

    @Step("Поле {0} : значение {1}")
    public void stepFillField(String name, String value) {
        new RegistrationPage(driver).fillField(name, value);
    }

    @Step("Поле {0}")
    public void stepCheckFieldValue(String name, String value) {
        new RegistrationPage(driver).checkFieldValue(name, value);
    }

    @Step("Проверено заполнение полей")
    public void stepCheckFieldsValue(HashMap <String, String> fields) {
        fields.forEach(this::stepCheckFieldValue);
    }

    @Step("Заполнены поля формы:")
    public void stepFillFields(HashMap <String, String> fields) {
        fields.forEach(this::stepFillField);
    }


    @Step("Нажата кнопка - Продолжить")
    public void stepPressContinue() {
        new RegistrationPage(driver).pressContinue();
    }


    @Step("Проверены уведомления об ошибках заполнения")
    public void stepCheckNotifications(){
        new RegistrationPage(driver).checkNotifications();
    }

}
