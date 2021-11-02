package allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct extends BasePage{

    public SelectProduct(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy (xpath = "//input-select")
    WebElement regionList;

    @FindBy (xpath = "//input-select/div/div/div/ul")
    WebElement regions;

    @FindBy (xpath = "//form/div/fieldset[6]/div")
    WebElement sums;

    @FindBy (xpath = "//button[contains(text(), 'Оформить')]")
    WebElement buttonCheckout;

    public void selectRegion(String region){
    regionList.click();
    regions.findElement(By.xpath(".//*[contains(text(),'" + region + "')]")).click();
    }

    public void selectSum(String sum){
        WebElement element = sums.findElement(By.xpath("//h3[contains(text(),'" + sum + "')]"));
        scrollAndClick(element);
    }

    public void checkout(){
        scrollAndClick(buttonCheckout);
    }
}
