package steps;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {
    static WebDriver driver;
    static String baseUrl;
    public static Properties properties = TestProperties.getInstance().getProperties();

    @BeforeClass
    public static void beforeTest(){
        System.setProperty("webdriver.chrome.driver",properties.getProperty("driver.path"));
        baseUrl = properties.getProperty("baseUrl");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterClass
    public static void afterTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
