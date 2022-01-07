package co.com.sofka.questions.webUi;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.webUi.MyStoreSingInLocator.MESSAGE_VALIDATION;


public class MyStoreSingInValidation implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MESSAGE_VALIDATION.resolveFor(actor).getText();
    }
    public static MyStoreSingInValidation myStoreSingInValidation(){
        return new MyStoreSingInValidation();
    }
}
