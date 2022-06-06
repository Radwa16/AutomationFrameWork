package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

public class Helper {
    WebDriver driver;
    public Helper(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement Waiting(int time ,String element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        WebElement elements  = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        return elements;
    }
    public WebElement WaitingID(int time ,String element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        WebElement elements  = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id(element)));
        return elements;
    }
}
