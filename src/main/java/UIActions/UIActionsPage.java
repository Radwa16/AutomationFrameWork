package UIActions;

import Utils.LocatorIdentifer;
import Utils.LocatorIdentifer.Locators;
import Utils.WaitPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UIActionsPage {
    WebDriver driver;
    WaitPage waitPage;
    LocatorIdentifer locate;
    public UIActionsPage(WebDriver driver)
    {
        this.driver = driver;
        waitPage = new WaitPage(driver);
        locate = new LocatorIdentifer(driver);
    }

    public void CLickon(Locators locator , String element)
    {
        WebElement button = driver.findElement(locate.IdentifyLocatorType(locator,element));
        boolean ButtonExist = button.isDisplayed();
        if(ButtonExist)
        {
            button.click();
        }
        else if(ButtonExist)
        {
            Actions a = new Actions(driver);
            a.moveToElement(button).doubleClick().build().perform();
        }
        else if (ButtonExist)
        {
            button.submit();
        }

    }

    public void SendText(String element , String word)
    {
        WebElement elements =  waitPage.Waiting(Locators.ID,50 , element);
        elements.sendKeys(word);
    }
    public void CheckRadioButton(String element)
    {
        WebElement elements =  waitPage.Waiting(Locators.ID,50 , element);
        elements.click();
    }
    public void ChooseFromDropDownList(Locators locator ,String element , String value)
    {
        Select dropdownmenu = new Select(driver.findElement(locate.IdentifyLocatorType(locator,element)));
        dropdownmenu.selectByValue(value);
    }

    public void Hovering(Locators locator , String Hoveredelement , String clickedelement)
    {
        WebElement Hoverelement = driver.findElement(locate.IdentifyLocatorType(locator,Hoveredelement));
        Actions action = new Actions(driver);
        action.moveToElement(Hoverelement).build().perform();;
        WebElement Clickelement =  waitPage.Waiting(Locators.Xpath,50 , clickedelement);
        Clickelement.click();
    }


}
