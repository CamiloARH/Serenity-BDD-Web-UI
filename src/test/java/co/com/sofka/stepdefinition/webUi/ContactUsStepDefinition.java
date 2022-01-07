package co.com.sofka.stepdefinition.webUi;


import co.com.sofka.stepdefinition.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.Locale;

import static co.com.sofka.questions.webUi.MyStoreContUsErrorValidation.myStoreContUsErrorValidation;
import static co.com.sofka.questions.webUi.MyStoreContUsValidation.myStoreContUsValidation;
import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.webUi.BrowseToContactUs.browseToContacUs;
import static co.com.sofka.tasks.webUi.FillContacUs.fillContacUs;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


public class ContactUsStepDefinition extends Setup {


    public static Logger log = Logger.getLogger(ContactUsStepDefinition.class);

    //Scenario 1
    @Given("el usuario esta en la pagina y desea contactarse con servicio al cliente")
    public void elUsuarioEstaEnLaPaginaYDeseaContactarseConServicioAlCliente() {
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

    @When("el usuario llena todos los campos")
    public void elUsuarioLlenaTodosLosCampos() {
        try {theActorInTheSpotlight().attemptsTo(
                browseToContacUs(),
                fillContacUs()
                        .withEmail(email)
                        .andOrderandOrderReference(orderReference)
                        .andMessage(writeMessage + " " + "Se me daño el teclado")
        );
            log.info("Se ingresa y se llena la informacion del contact us primer Scenario");
        } catch (Exception e) {
            log.error("error en el llenado de la informacion del contact us primer Scenario");
        }
    }

    @Then("el usuario deberia ver el mensaje {string}")
    public void elUsuarioDeberiaVerElMensaje(String answerOk) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            myStoreContUsValidation(), equalTo(answerOk)
                    )
            );
            log.info("Se verifica que el envio del contact us fue exitoso en primer Scenario");
        } catch (Exception e) {
            log.error("Error en la verificacion del primer Scenario");
        }
    }

    //Scenario 2
    @Given("el usuario entra en la pagina y desea contactarse con servicio al cliente")
    public void elUsuarioEntraEnLaPaginaYDeseaContactarseConServicioAlCliente() {
        try {
            actorSetupTheBrowser(actor.getName());
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
            log.info("Se realiza el setup del segundo scenario");
        } catch (Exception e) {
            log.error("Un error al realizar el landing en el segundo Scenario");
        }
    }

    @When("el usuario llena los campos pero no escribe el mensaje")
    public void elUsuarioLlenaLosCamposPeroNoEscribeElMensaje() {
        try {theActorInTheSpotlight().attemptsTo(
                browseToContacUs(),
                fillContacUs()
                        .withEmail(email)
                        .andOrderandOrderReference(orderReference)
                        .andMessage("")
        );
            log.info("Se ingresa y se llena la informacion del contact us segundo Scenario");
        } catch (Exception e) {
            log.error("error en el llenado de la informacion del contact us segundo Scenario");
        }
    }

    @Then("el usuario debera ver el mensaje {string}")
    public void elUsuarioDeberaVerElMensaje(String answerError) {
        try {theActorInTheSpotlight().should(
                seeThat(
                        myStoreContUsErrorValidation(), equalTo(answerError)
                )
        );
            log.info("Se verifica que el envio del contact us no fue exitoso en segundo Scenario");
        } catch (Exception e) {
            log.error("Error en la verificacion del segundo Scenario");
        }
    }

    Faker usFaker = new Faker(new Locale("en-US"));
    String name = usFaker.name().firstName();
    String lastName = usFaker.name().lastName();
    String email = name + lastName + "@gmail.com";
    String orderReference = usFaker.bothify("####-????");
    String writeMessage = usFaker.gameOfThrones().dragon();

}

