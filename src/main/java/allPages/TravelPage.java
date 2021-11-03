package allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;


public class TravelPage extends BasePage{

    public TravelPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
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
