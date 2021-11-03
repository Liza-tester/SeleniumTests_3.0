package allPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.ArrayList;

public class BasePage {

    WebDriver driver = BaseSteps.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public void setField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public String getField(WebElement element) {
        return element.getAttribute("value");
    }

    public void scrollAndClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void switchTab(String title) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        for (String tab : tabs) {
            driver.switchTo().window(tab);
            if (driver.getTitle().contains(title)) break;
        }
    }

}
