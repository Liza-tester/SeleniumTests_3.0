package allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class StartPage extends BasePage{

    public StartPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//*[@aria-label='Основное меню']")
     WebElement menuItems;

    @FindBy(xpath = "//li[9]/div/div[1]/ul")
    WebElement insuranceItems;
    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//*[contains(text(), '"+itemName+"')]")).click();
    }
    public void selectInsuranceItem(String itemName) {
        insuranceItems.findElement(By.xpath(".//*[contains(text(), '"+itemName+"')]")).click();
    }
}
