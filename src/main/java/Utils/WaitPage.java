package Utils;

import UIActions.UIActionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utils.LocatorIdentifer.Locators;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitPage {
    WebDriver driver;
    LocatorIdentifer locate;
    public WaitPage(WebDriver driver)
    {
        this.driver = driver;
        locate = new LocatorIdentifer(driver);
    }
    public WebElement Waiting(Locators locators , int time ,String element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        WebElement elements  = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locate.IdentifyLocatorType(locators,element)));
        return elements;
    }
//    public WebElement WaitingID(int time ,String element)
//    {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
//        WebElement elements  = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(UIPage.IdentifyLocatorType(Locators.Xpath,element)));
//        return elements;
//    }
}
