package BrowserActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActionsPage {
    WebDriver driver;

    public WebDriver BroswerSetup(Drivers driverType)
    {
        if (driverType == Drivers.Chrome)
        {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        if (driverType == Drivers.Firefox)
        {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        return driver;
    }

    public void GoToTheSite(String Url)
    {
        driver.get(Url);
    }

   public enum Drivers {
        Chrome,
        Firefox,
        Edge
    }
}
