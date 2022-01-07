package co.com.sofka.tasks.webUi;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.webUi.MyStoreContactUsLocator.CONTACT_US;

public class BrowseToContactUs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTACT_US)
        );
    }

    public static BrowseToContactUs browseToContacUs(){
        return new BrowseToContactUs();
    }
}
