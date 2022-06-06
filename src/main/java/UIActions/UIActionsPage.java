package UIActions;

import BrowserActions.BrowserActionsPage;
import Utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UIActionsPage {
    WebDriver driver;
    Helper helper;
    public UIActionsPage(WebDriver driver)
    {
        this.driver = driver;
        helper = new Helper(driver);
    }

    public void CLickon(Locators locator , String element)
    {
        driver.findElement(IdentifyLocatorType(locator,element)).click();//sign up
    }
//    public void CLickonById(String element)
//    {
//        driver.findElement(By.id(element)).click();//sign up
//    }

    public void SendText(String element , String word)
    {
        WebElement elements =  helper.WaitingID(50 , element);
        elements.sendKeys(word);
    }
    public void CheckRadioButton(String element)
    {
        WebElement elements =  helper.WaitingID(50 , element);
        elements.click();
    }
    public void ChooseFromDropDownList(String element , String value)
    {
        Select dropdownmenu = new Select(driver.findElement(By.id(element)));
        dropdownmenu.selectByValue(value);
    }

    public void Hovering(String Hoveredelement , String clickedelement)
    {
        WebElement Hoverelement = driver.findElement(By.xpath(Hoveredelement));
        Actions action = new Actions(driver);
        action.moveToElement(Hoverelement).build().perform();;
        WebElement Clickelement =  helper.Waiting(50 , clickedelement);
        Clickelement.click();
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
