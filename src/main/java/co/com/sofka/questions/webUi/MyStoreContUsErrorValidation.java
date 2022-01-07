package co.com.sofka.questions.webUi;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.webUi.MyStoreContactUsLocator.MESSAGE_VALIDATION_ERROR;

public class MyStoreContUsErrorValidation implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MESSAGE_VALIDATION_ERROR.resolveFor(actor).getText();
    }
    public static MyStoreContUsErrorValidation myStoreContUsErrorValidation(){
        return new MyStoreContUsErrorValidation();
    }
}
