package co.com.sofka.tasks.webUi;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.webUi.MyStoreContactUsLocator.*;

public class FillContacUs implements Task {

    private String email;
    private String order_reference;
    private String message;

    public FillContacUs withEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContacUs andOrderandOrderReference(String orderReference) {
        this.order_reference = orderReference;
        return this;
    }

    public FillContacUs andMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SUBJECT_HEADING_CUSTOMER),
                Enter.theValue(email).into(EMAIL),
                Enter.theValue(order_reference).into(ORDER_REFERENCE),
                Enter.theValue(message).into(MESSAGE),
                Scroll.to(BUTTON_SUTMITMESSAGE),
                Click.on(BUTTON_SUTMITMESSAGE)
        );
    }

    public static FillContacUs fillContacUs(){
        return new FillContacUs();
    }
}
