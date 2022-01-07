package co.com.sofka.tasks.webUi;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static co.com.sofka.userinterfaces.webUi.MyStoreSingInLocator.*;


public class BrowseToTheSingIn implements Task {
    private String email;

    public BrowseToTheSingIn withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGN_IN),
                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),
                Click.on(SUBMIT_CREATE)
        );
    }

    public static BrowseToTheSingIn browseToTheSingIn(){
        return new BrowseToTheSingIn();
    }
}
