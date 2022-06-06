package Pages;

import UIActions.UIActionsPage;
import Utils.LocatorIdentifer.Locators;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    UIActionsPage UIpage;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        UIpage=new UIActionsPage(driver);

    }
    public void EnterEmail(String element , String email)
    {
        UIpage.SendText(element,email);
    }
    public void EnterPassword(String element , String email)
    {
        UIpage.SendText(element,email);
    }
    public LoggedHomePage ClickOnSignin(String element)
    {
        UIpage.CLickon(Locators.ID,element);
        return new LoggedHomePage(driver);
    }

}
