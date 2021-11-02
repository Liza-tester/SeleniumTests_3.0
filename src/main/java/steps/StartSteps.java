package steps;

import allPages.StartPage;
import ru.yandex.qatools.allure.annotations.Step;

public class StartSteps extends BaseSteps{

@Step("Выбран пункт меню - {0}")
        public void stepSelectMenuItem(String value){
    new StartPage(driver).selectMenuItem(value);
    }

@Step("Выбран объект страхования - {0}")
        public void stepSelectInsuranceItem(String value){
    new StartPage(driver).selectInsuranceItem(value);
}
}
