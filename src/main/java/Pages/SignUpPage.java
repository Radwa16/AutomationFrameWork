package Pages;

import UIActions.UIActionsPage;
import org.openqa.selenium.WebDriver;
import UIActions.UIActionsPage.Locators;

public class SignUpPage {
    WebDriver driver;
    UIActionsPage UIpage;
    public SignUpPage(WebDriver driver)
    {
        this.driver = driver;
        UIpage=new UIActionsPage(driver);
    }

    //    public void FillRegisterationForm()
//    {
//
//    }
    public void ChooseTitle(String element)
    {
        UIpage.CheckRadioButton(element);
    }
    public void FillFirstName(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void FillLastName(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void FillEmail(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void FillPassword(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void ChooseDay(String element ,  String value)
    {
        UIpage.ChooseFromDropDownList(element, value);
    }
    public void ChooseMonth(String element ,  String value)
    {
        UIpage.ChooseFromDropDownList(element, value);
    }
    public void ChooseYear(String element ,  String value)
    {
        UIpage.ChooseFromDropDownList(element, value);
    }
    public void FillCompany(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void FillAddress(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void FillCity(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void ChooseState(String element ,  String value)
    {
        UIpage.ChooseFromDropDownList(element, value);
    }
    public void FillZipCode(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void ChooseCountry(String element ,  String value)
    {
        UIpage.ChooseFromDropDownList(element, value);
    }
    public void FillPhoneNumber(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public void FillAddressAlias(String element,String text)
    {
        UIpage.SendText(element,text);
    }
    public LoggedHomePage ClickOnSubmit(String element)
    {
        UIpage.CLickon(Locators.ID,element);
        return new LoggedHomePage(driver);
    }
}
