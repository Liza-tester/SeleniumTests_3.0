package steps;

import allPages.StartPage;
import ru.yandex.qatools.allure.annotations.Step;

public class StartSteps {

    @Step("Выбран пункт меню - {0}")
    public void stepSelectMenuItem(String value) {
        new StartPage().selectMenuItem(value);
    }

    @Step("Выбран объект страхования - {0}")
    public void stepSelectInsuranceItem(String value) {
        new StartPage().selectInsuranceItem(value);
    }
}
