package allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceProgramsPage extends BasePage {

    public InsuranceProgramsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class='product-catalog__carousel_row']")
    WebElement insurancePrograms;

    public void selectInsuranceProgram(String program) {
        WebElement element = insurancePrograms.findElement(By.xpath(".//*[text() ='" + program + "']"));
        scrollAndClick(element);
    }

}
