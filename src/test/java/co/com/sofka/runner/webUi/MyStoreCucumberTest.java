package co.com.sofka.runner.webUi;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/webUi/contactUs.feature","src/test/resources/features/webUi/singInAndshopingCar.feature"},
        glue = {"co.com.sofka.stepdefinition.webUi"}
)
public class MyStoreCucumberTest {
}
