package steps;

import allPages.InsuranceProgramsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceProgramsSteps extends BaseSteps {
    @Step("Выбрана программа {0}")
    public void stepSelectInsuranceProgram(String value){
     new InsuranceProgramsPage(driver).selectInsuranceProgram(value);
    }
}
