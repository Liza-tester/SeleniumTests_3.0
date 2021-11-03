package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TravelPage extends BasePage{

    public TravelPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//*[@data-test-id='PageTeaserDict_header']")
    WebElement title;


    @FindBy (xpath = "//span[text()='Оформить онлайн']")
    WebElement buttonOnline;

    @FindBy (xpath = "//span[text()='Оформить на сайте']")
    WebElement buttonOnWebsite;

    public String getTitle() {
        return title.getText();
    }

    public void checkoutOnline(){
        scrollAndClick(buttonOnline);
    }

    public void checkoutOnWebsite(){
        scrollAndClick(buttonOnWebsite);
        switchTab("Страхование путешественников");
    }

}
