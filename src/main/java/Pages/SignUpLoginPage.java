package Pages;

import UIActions.UIActionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utils.LocatorIdentifer.Locators;

public class SignUpLoginPage {
    WebDriver driver;
    UIActionsPage UIPage;
    public SignUpLoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void Register(String element , String word )
    {
        UIPage = new UIActionsPage(driver);
        UIPage.SendText(element,word);
    }
    public SignUpPage ClickOnRegister(String element)
    {
        UIPage = new UIActionsPage(driver);
        UIPage.CLickon(Locators.ID,element);
        return new SignUpPage(driver);
    }
}
