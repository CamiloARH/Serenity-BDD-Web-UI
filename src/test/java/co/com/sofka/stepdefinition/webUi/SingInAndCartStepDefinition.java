package co.com.sofka.stepdefinition.webUi;

import co.com.sofka.stepdefinition.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.Locale;

import static co.com.sofka.questions.webUi.MyStoreSignInValidation.myStoreSingInValidation;
import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.webUi.BrowseToTheSignIn.browseToTheSingIn;
import static co.com.sofka.tasks.webUi.FillSignIn.fillSingIn;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SingInAndCartStepDefinition extends Setup {

    public static Logger log = Logger.getLogger(SingInAndCartStepDefinition.class);

    //Scenario 1
    @Given("el usuario debe incribirse en la pagina")
    public void elUsuarioDebeIncribirseEnLaPagina() {
        try {
            actorSetupTheBrowser(actor.getName());
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
            log.info("Se realiza el setup del primer Scenario");
        } catch (Exception e) {
            log.error("Un error al realizar el landing en el primer Scenario");
        }
    }

    @When("el usuario entra a Sign In")
    public void elUsuarioEntraASignIn() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    browseToTheSingIn().withEmail(email),
                    fillSingIn()
                            .withName(name)
                            .withLastName(lastName)
                            .withPassword(password)
                            .inTheCompany(company)
                            .inTheAddress(address)
                            .onTheCity(city)
                            .withThePostcode(codePostal)
                            .andOther(other)
                            .withThePhone(phone)
                            .withTheCellPhone(cellPhone)
                            .withTheAlias(alias)
            );
            log.info("Se ingresa y se llena la informacion del sing in primer Scenario");
        } catch (Exception e) {
            log.error("error en el llenado de la informacion del sing in primer Scenario");
        }
    }

    @Then("el usuario completa la incripcion y debera ver su nombre")
    public void elUsuarioCompletaLaIncripcionYDeberaVerSuNombre() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            myStoreSingInValidation(), equalTo(name + " " + lastName)
                    )
            );
            log.info("Se verifica que el sing in fue exitoso en primer Scenario");
        } catch (Exception e) {
            log.error("Error en la verificacion del primer Scenario");
        }
    }

    //Scenario 1
    @Given("el usuario debe incribirse en la pagina para comprar")
    public void elUsuarioDebeIncribirseEnLaPaginaParaComprar() {
        try {
            actorSetupTheBrowser(actor.getName());
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
            log.info("Se realiza el setup del segundo Scenario");
        } catch (Exception e) {
            log.error("Un error al realizar el landing en el segundo Scenario");
        }
    }

    @When("el usuario entra a Sign In para incribirse")
    public void elUsuarioEntraASignInParaIncribirse() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    browseToTheSingIn().withEmail(email),
                    fillSingIn()
                            .withName(name)
                            .withLastName(lastName)
                            .withPassword(password)
                            .inTheCompany("")
                            .inTheAddress(address)
                            .onTheCity(city)
                            .withThePostcode(codePostal)
                            .andOther("")
                            .withThePhone("")
                            .withTheCellPhone(cellPhone)
                            .withTheAlias(alias)
            );
            log.info("Se ingresa y se llena parte de la informacion del sing in segundo Scenario");
        } catch (Exception e) {
            log.error("error en el llenado de la informacion del sing in segundo Scenario");
        }
    }

    @Then("el usuario realiza la incripcion y debera ver su nombre")
    public void elUsuarioRealizaLaIncripcionYDeberaVerSuNombre() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            myStoreSingInValidation(), equalTo(name + " " + lastName)
                    )
            );
            log.info("Se verifica que el sing in fue exitoso en segundo Scenario");
        } catch (Exception e) {
            log.error("Error en la verificacion del segundo Scenario");
        }
    }

    Faker usFaker = new Faker(new Locale("en-US"));
    String name = usFaker.name().firstName();
    String lastName = usFaker.name().lastName();
    String email = name+lastName+"@gmail.com";
    String password = usFaker.bothify("#?#?#?#????");
    String company = usFaker.company().name();
    String address = usFaker.address().fullAddress();
    String city = usFaker.country().capital();
    String codePostal = usFaker.numerify("5####");
    String other = usFaker.chuckNorris().fact();
    String phone = usFaker.numerify("########");
    String cellPhone = usFaker.numerify("###########");
    String alias = usFaker.pokemon().name();
}
