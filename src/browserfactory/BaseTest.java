package browserfactory;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setUP() {
        // Setup browser
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://magento.softwaretestingboard.com/");
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }


    }
}
