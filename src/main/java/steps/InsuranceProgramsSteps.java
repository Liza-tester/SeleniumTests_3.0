package steps;

import allPages.InsuranceProgramsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceProgramsSteps {
    @Step("Выбрана программа {0}")
    public void stepSelectInsuranceProgram(String value){
     new InsuranceProgramsPage().selectInsuranceProgram(value);
    }
}
