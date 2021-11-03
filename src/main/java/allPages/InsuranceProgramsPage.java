package allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class InsuranceProgramsPage extends BasePage {

    public InsuranceProgramsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='product-catalog__carousel_row']")
    WebElement insurancePrograms;

    public void selectInsuranceProgram(String program) {
        WebElement element = insurancePrograms.findElement(By.xpath(".//*[text() ='" + program + "']"));
        scrollAndClick(element);
    }

}
