package allTests;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.HashMap;

public class AllureReportTest extends BaseSteps {

    @Title("Страхование путешественников")
    @Test
    public void insuranceTest(){
        StartSteps startSteps = new StartSteps();
        startSteps.stepSelectMenuItem("Страхование");
        startSteps.stepSelectInsuranceItem("страховые программы");

        InsuranceProgramsSteps insuranceProgramsSteps = new InsuranceProgramsSteps();
        insuranceProgramsSteps.stepSelectInsuranceProgram("Страхование путешественников");


        TravelSteps travelSteps = new TravelSteps();
        travelSteps.stepCheckTitle();
        travelSteps.stepCheckoutOnline();
        travelSteps.stepCheckoutOnWebsite();

        SelectProductSteps selectProductSteps = new SelectProductSteps();
        selectProductSteps.stepSelectRegion("Все страны мира, кроме США и РФ");
        selectProductSteps.stepSelectSum("Минимальная");
        selectProductSteps.stepCheckout();

        HashMap<String, String> testData = new HashMap<String, String>();
        testData.put("Фамилия застрахованного", "Ivanov");
        testData.put("Имя застрахованного", "Ivan");
        testData.put("Дата рождения застрахованного", "02.02.1992");
        testData.put("Фамилия", "Александрова");
        testData.put("Имя", "Александра");
        testData.put("Отчество", "Александровна");
        testData.put("Дата рождения", "01.01.1991");
        testData.put("Пол", "Женский");
        testData.put("Серия паспорта","1111");
        testData.put("Номер паспорта","123456");
        testData.put("Дата выдачи паспорта","01.09.2020");
        testData.put("Кем выдан паспорт","ЙЦУК №123");

        RegistrationSteps registrationSteps = new RegistrationSteps();
        registrationSteps.stepFillFields(testData);
        registrationSteps.stepCheckFieldsValue(testData);
        registrationSteps.stepCheckFieldValue("Мобильный телефон", "");
        registrationSteps.stepCheckFieldValue("Электронная почта", "");
        registrationSteps.stepCheckFieldValue("Повтор электронной почты", "");
        registrationSteps.stepPressContinue();
        registrationSteps.stepCheckNotifications();

    }
}
