package co.com.sofka.questions.webUi;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.webUi.MyStoreContactUsLocator.MESSAGE_VALIDATION_OK;

public class MyStoreContUsValidation implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MESSAGE_VALIDATION_OK.resolveFor(actor).getText();
    }
    public static MyStoreContUsValidation myStoreContUsValidation(){
        return new MyStoreContUsValidation();
    }
}
