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
    @FindBy (xpath = "//*[@name='regionType']")
    WebElement regionList;

    @FindBy (xpath = "//*[@name='regionType']//*[@role='menu']")
    WebElement regions;

    @FindBy (xpath = "//*[text() = 'Выберите сумму страховой защиты']/following-sibling::*")
    WebElement sums;

    @FindBy (xpath = "//button[text()= 'Оформить']")
    WebElement buttonCheckout;

    public void selectRegion(String region){
    regionList.click();
    regions.findElement(By.xpath(".//*[text()='" + region + "']")).click();
    }

    public void selectSum(String sum){
        WebElement element = sums.findElement(By.xpath("//*[text() ='" + sum + "']"));
        scrollAndClick(element);
    }

    public void checkout(){
        scrollAndClick(buttonCheckout);
    }
}
