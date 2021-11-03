package steps;

import allPages.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;


public class RegistrationSteps {

    @Step("Поле {0} : значение {1}")
    public void stepFillField(String name, String value) {
        new RegistrationPage().fillField(name, value);
    }

    @Step("Поле {0} : значение {1}")
    public void stepCheckFieldValue(String name, String value) {
        new RegistrationPage().checkFieldValue(name, value);
    }

    @Step("Нажата кнопка - Продолжить")
    public void stepPressContinue() {
        new RegistrationPage().pressContinue();
    }


    @Step("Появилось уведомление об ошибке заполнения")
    public void stepCheckError(){
        new RegistrationPage().checkError();
    }

    @Step("Поле {0} : уведомление - {1}")
    public void stepCheckNotification(String name, String value){
        new RegistrationPage().checkNotification(name, value);
    }
}
