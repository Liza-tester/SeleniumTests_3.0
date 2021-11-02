package allPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class BasePage {

    WebDriver driver;

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
        String activeTab = driver.getWindowHandle();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        for (String tab : tabs) {
            driver.switchTo().window(tab);
            if (driver.getTitle().contains(title)) break;
        }
    }

}
