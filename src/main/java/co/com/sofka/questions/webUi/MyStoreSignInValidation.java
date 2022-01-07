package co.com.sofka.questions.webUi;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.webUi.MyStoreSignInLocator.MESSAGE_VALIDATION;


public class MyStoreSignInValidation implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MESSAGE_VALIDATION.resolveFor(actor).getText();
    }
    public static MyStoreSignInValidation myStoreSingInValidation(){
        return new MyStoreSignInValidation();
    }
}
