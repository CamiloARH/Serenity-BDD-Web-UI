package co.com.sofka.tasks.webUi;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.sofka.userinterfaces.webUi.MyStoreSignInLocator.*;

public class FillSignIn implements Task {

    private String name;
    private String lastName;
    private String password;
    private String company;
    private String address;
    private String city;
    private String postcode;
    private String other;
    private String alias;
    private String cellPhone;
    private String phone;


    public FillSignIn withName(String name) {
        this.name = name;
        return this;
    }

    public FillSignIn withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillSignIn withPassword(String password) {
        this.password = password;
        return this;
    }

    public FillSignIn inTheCompany(String company) {
        this.company = company;
        return this;
    }

    public FillSignIn inTheAddress(String address) {
        this.address = address;
        return this;
    }

    public FillSignIn onTheCity(String city) {
        this.city = city;
        return this;
    }

    public FillSignIn withThePostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public FillSignIn andOther(String other) {
        this.other = other;
        return this;
    }

    public FillSignIn withThePhone(String phone) {
        this.phone = phone;
        return this;
    }

    public FillSignIn withTheCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
        return this;
    }

    public FillSignIn withTheAlias (String alias) {
        this.alias = alias;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TITLE_MR),
                Enter.theValue(name).into(FIRST_NAME_PERSONAL),
                Enter.theValue(lastName).into(LAST_NAME_PERSONAL),
                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),
                Click.on(BIRTH_DAY),
                Click.on(BIRTH_MONTH),
                Click.on(BIRTH_YEAR),
                Click.on(NEWSLETTER),
                Click.on(SPECIAL_OFFERS),
                Enter.theValue(name).into(FIRST_NAME_ADDRESS),
                Enter.theValue(lastName).into(LAST_NAME_ADDRESS),
                Enter.theValue(company).into(COMPANY_NAME),
                Enter.theValue(address).into(ADDRESS),
                Enter.theValue(city).into(CITY),
                Click.on(STATE),
                Scroll.to(POSTCODE),
                Enter.theValue(postcode).into(POSTCODE),
                Enter.theValue(other).into(WRITE_OTHER),
                Enter.theValue(phone).into(PHONE_NUMBER),
                Enter.theValue(cellPhone).into(CELLPHONE_NUMBER),
                Enter.theValue(alias).into(ALIAS),
                Click.on(SUBMIT_ACCOUNT)
        );
    }

    public static FillSignIn fillSingIn(){
        return new FillSignIn();
    }
}
