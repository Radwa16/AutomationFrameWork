package Pages;

import UIActions.UIActionsPage;
import Utils.LocatorIdentifer.Locators;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    UIActionsPage UIPage;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        UIPage = new UIActionsPage(driver);

    }
    public SignUpLoginPage PressOnSignUpButton(String SignupElement)
    {
        UIPage.CLickon(Locators.CSS,SignupElement);
        return new SignUpLoginPage(driver);
    }
    public  BlousesPage ChooseBlousesCatregory(String Hoveredelement , String clickedelement)
    {
        UIPage.Hovering(Locators.Xpath,Hoveredelement,clickedelement);
        return new BlousesPage(driver);
    }
}
