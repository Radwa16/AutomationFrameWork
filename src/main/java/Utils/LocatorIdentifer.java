package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorIdentifer {
    WebDriver driver;
    public LocatorIdentifer(WebDriver driver)
    {
        this.driver = driver;
    }

    public By IdentifyLocatorType(Locators locator , String element)
    {
        By LocatorType = null;
        if (locator == Locators.Xpath)
        {
            LocatorType = new By.ByXPath(element);
        }
        if (locator == Locators.ID)
        {
            LocatorType = new By.ById(element);
        }
        if (locator == Locators.CSS)
        {
            LocatorType = new By.ByCssSelector(element);
        }
        return LocatorType;
    }
    public enum Locators {
        Xpath,
        ID,
        CSS
    }
}
