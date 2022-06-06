package Tests;

import BrowserActions.BrowserActionsPage;
import BrowserActions.BrowserActionsPage.Drivers;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpLoginPage;
import Pages.SignUpPage;
import UIActions.UIActionsPage;
import data.JSONDataReader;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest {
    BrowserActionsPage browserpage;
    HomePage Homy;
    SignUpLoginPage Sign;
    SignUpPage SignUp;
    WebDriver driver;
    LoginPage login;
    JSONDataReader JsonReader = new JSONDataReader();
    @BeforeClass
    public void Setup() throws IOException, ParseException {
        browserpage = new BrowserActionsPage();
        driver = browserpage.BroswerSetup(Drivers.Chrome);
        browserpage.GoToTheSite("http://automationpractice.com/index.php");

    }
    @Test
    public void HomeTest()
    {
        Homy = new HomePage(driver);
//        Homy.ChooseBlousesCatregory("//div[@id = \"block_top_menu\"]//descendant :: li/a[@title= \"Women\"]"
//                ,"//div[@id = \"block_top_menu\"]//descendant :: li/a[@title= \"Blouses\"]");
        Homy.PressOnSignUpButton("a.login");
    }
    @Test(dependsOnMethods = { "HomeTest" })
    public void GoTOSignUpTest() throws IOException, ParseException {
        JsonReader.Jsonreader();
        Sign = new SignUpLoginPage(driver);
        Sign.Register("email_create",JsonReader.email);
        Sign.ClickOnRegister("SubmitCreate");
    }

    @Test(dependsOnMethods = { "GoTOSignUpTest" })
    public void FillRegisterationForm() throws IOException, ParseException {
        JsonReader.Jsonreader();
        SignUp = new SignUpPage(driver);
        SignUp.ChooseTitle("id_gender2");
        SignUp.FillFirstName("customer_firstname",JsonReader.firstname);
        SignUp.FillLastName("customer_lastname",JsonReader.lastname);
        //SignUp.FillEmail("email","Radwaaaa@gmail.com");
        SignUp.FillPassword("passwd",JsonReader.password);
        SignUp.ChooseDay("days" , JsonReader.day);
        SignUp.ChooseMonth("months" , JsonReader.month);
        SignUp.ChooseYear("years" , JsonReader.year);
        SignUp.FillCompany("company",JsonReader.company);
        SignUp.FillAddress("address1",JsonReader.address);
        SignUp.FillCity("city",JsonReader.city);
        SignUp.ChooseState("id_state",JsonReader.state);
        SignUp.FillZipCode("postcode",JsonReader.zipcode);
        SignUp.ChooseCountry("id_country",JsonReader.country);
        SignUp.FillPhoneNumber("phone_mobile",JsonReader.phone);
        SignUp.FillAddressAlias("alias",JsonReader.address);
        SignUp.ClickOnSubmit("submitAccount");
    }

//    @Test(dependsOnMethods = { "HomeTest" })
//    public void LoginTest()
//    {
//        login = new LoginPage(driver);
//        login.EnterEmail("email","Radwaaaa@gmail.com");
//        login.EnterPassword("passwd","123456");
//        login.ClickOnSignin("SubmitLogin");
//    }
}
