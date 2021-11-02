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

    @FindBy(xpath = "//*[@id='page-main']/div[1]/div/div[2]/div[4]/div/div")
    WebElement insurancePrograms;

    public void selectInsuranceProgram(String program) {
        WebElement element = insurancePrograms.findElement(By.xpath(".//*[contains(text(),'" + program + "')]"));
        scrollAndClick(element);
    }

}
