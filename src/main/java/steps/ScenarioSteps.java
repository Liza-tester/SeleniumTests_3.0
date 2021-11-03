package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    InsuranceProgramsSteps insuranceProgramsSteps = new InsuranceProgramsSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();
    SelectProductSteps selectProductSteps = new SelectProductSteps();
    StartSteps startSteps = new StartSteps();
    TravelSteps travelSteps = new TravelSteps();

    @When("^выбран пункт главного меню - \"(.*)\"$")
    public void stepSelectMenuItem(String menuItem) {
        startSteps.stepSelectMenuItem(menuItem);
    }

    @When("^выбран объект страхования - \"(.*)\"$")
    public void stepSelectInsuranceItem(String menuItem) {
        startSteps.stepSelectInsuranceItem(menuItem);
    }

    @When("^выбрана программа - \"(.*)\"$")
    public void stepSelectInsuranceProgram(String menuItem) {
        insuranceProgramsSteps.stepSelectInsuranceProgram(menuItem);
    }

    @Then("^заголовок страницы - Страхование путешественников")
    public void stepCheckTitle() {
        travelSteps.stepCheckTitle();
    }

    @When("^нажата кнопка - Оформить онлайн")
    public void stepCheckoutOnline() {
        travelSteps.stepCheckoutOnline();
    }

    @When("^нажата кнопка - Оформить на сайте")
    public void stepCheckoutOnWebsite() {
        travelSteps.stepCheckoutOnWebsite();
    }

    @When("^выбран регион - \"(.*)\"$")
    public void stepSelectRegion(String value) {
        selectProductSteps.stepSelectRegion(value);
    }

    @When("^выбрана сумма - \"(.*)\"$")
    public void stepSelectSum(String value) {
        selectProductSteps.stepSelectSum(value);
    }

    @When("^нажата кнопка - Оформить$")
    public void stepCheckout() {
        selectProductSteps.stepCheckout();
    }

    @When("^заполняются поля:$")
    public void stepFillFields(DataTable fields) {
        fields.asMap(String.class, String.class).forEach(
                (key, value) -> registrationSteps.stepFillField(key, value));
    }

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((key, value) -> registrationSteps.stepCheckFieldValue(key, value));
    }

    @When("^нажата кнопка - Продолжить$")
    public void stepPressContinue() {
        registrationSteps.stepPressContinue();
    }

    @Then("^появилось уведомление - При заполнении данных произошла ошибка$")
    public void stepCheckError() {
        registrationSteps.stepCheckError();
    }

    @Then("^поля содержат ошибки:$")
    public void stepCheckNotification(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((key, value) -> registrationSteps.stepCheckNotification(key, value));
    }
}