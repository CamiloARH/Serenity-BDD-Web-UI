package co.com.sofka.userinterfaces.webUi;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


import static org.openqa.selenium.By.*;

public class MyStoreContactUsLocator extends PageObject {

    public static final Target CONTACT_US = Target
            .the("Contact us")
            .located(id("contact-link"));

    public static final Target SUBJECT_HEADING_CUSTOMER = Target
            .the("Subject Heading")
            .located(cssSelector("#id_contact :nth-child(2)"));

    public static final Target SUBJECT_HEADING_WEBMASTER = Target
            .the("Subject Heading")
            .located(cssSelector("#id_contact :nth-child(1)"));

    public static final Target EMAIL = Target
            .the("Email address")
            .located(id("email"));

    public static final Target ORDER_REFERENCE = Target
            .the("Order reference")
            .located(id("id_order"));

    public static final Target MESSAGE = Target
            .the("Message")
            .located(id("message"));

    public static final Target BUTTON_SUTMITMESSAGE = Target
            .the("Button sutmit message")
            .located(id("submitMessage"));


    //For validations

    public static final Target MESSAGE_VALIDATION_OK = Target
            .the("Message comfirm send")
            .located(cssSelector("#center_column  :nth-child(2)"));

    public static final Target MESSAGE_VALIDATION_ERROR = Target
            .the("Message There is 1 error")
            .located(cssSelector("div[class='alert alert-danger'] li"));
}
