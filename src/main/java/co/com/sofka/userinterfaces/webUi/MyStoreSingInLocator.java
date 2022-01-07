package co.com.sofka.userinterfaces.webUi;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Locale;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.cssSelector;

public class MyStoreSingInLocator {
    public static final Target SIGN_IN = Target
            .the("Sign in")
            .located(className("header_user_info"));

    public static final Target EMAIL = Target
            .the("Email to write")
            .located(id("email_create"));

    public static final Target SUBMIT_CREATE = Target
            .the("Submit botton")
            .located(id("SubmitCreate"));

    public static final Target TITLE_MR = Target
            .the("MR title")
            .located(id("id_gender1"));

    public static final Target TITLE_MRS = Target
            .the("MRS title")
            .located(id("id_gender2"));

    public static final Target FIRST_NAME_PERSONAL = Target
            .the("first name")
            .located(id("customer_firstname"));

    public static final Target LAST_NAME_PERSONAL = Target
            .the("last name")
            .located(id("customer_lastname"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(id("passwd"));

    public static final Target BIRTH_DAY = Target
            .the("Birth day")
            .located(cssSelector("#days :nth-child(11)"));

    public static final Target BIRTH_MONTH = Target
            .the("Birth month")
            .located(cssSelector("#months :nth-child(2)"));

    public static final Target BIRTH_YEAR = Target
            .the("Birth year")
            .located(cssSelector("#years :nth-child(24)"));

    public static final Target NEWSLETTER = Target
            .the("Nesletter")
            .located(id("newsletter"));

    public static final Target SPECIAL_OFFERS = Target
            .the("Receive special offers")
            .located(id("optin"));

    public static final Target FIRST_NAME_ADDRESS = Target
            .the("first name address")
            .located(id("firstname"));

    public static final Target LAST_NAME_ADDRESS = Target
            .the("last name address")
            .located(id("lastname"));

    public static final Target COMPANY_NAME = Target
            .the("Company name")
            .located(id("company"));

    public static final Target ADDRESS = Target
            .the("Address")
            .located(id("address1"));

    public static final Target CITY = Target
            .the("city")
            .located(id("city"));

    public static final Target STATE = Target
            .the("state")
            .located(cssSelector("#id_state :nth-child(11)"));

    public static final Target POSTCODE = Target
            .the("Postcode")
            .located(id("postcode"));

    public static final Target WRITE_OTHER = Target
            .the("Other space to write")
            .located(id("other"));

    public static final Target PHONE_NUMBER = Target
            .the("Phone number")
            .located(id("phone"));

    public static final Target CELLPHONE_NUMBER = Target
            .the("Cellphone number")
            .located(id("phone_mobile"));

    public static final Target ALIAS = Target
            .the("Your alias")
            .located(id("alias"));

    public static final Target SUBMIT_ACCOUNT = Target
            .the("Botton ti finish")
            .located(id("submitAccount"));

    //For validations

    public static final Target MESSAGE_VALIDATION = Target
            .the("Messge to validation")
            .located(cssSelector(".account :nth-child(1)"));
}
