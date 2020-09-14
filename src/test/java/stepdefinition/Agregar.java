package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.assertions.ResultNotWaitedAssertion;
import interactions.Cargar;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Validacion;
import tasks.AgregarPalabra;

import static exceptions.assertions.ResultNotWaitedAssertion.FAILED_VALIDATION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Agregar {

    @Before
    public void setHabilidadesActor() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que (.*) cargo la pagina$")
    public void queSaulCargoLaPagina(String actor) throws Exception {
        theActorCalled(actor).wasAbleTo(Cargar.laPagina());
    }

    @When("^agrego la palabra clave '(.*)'$")
    public void agregoLaPalabraClaveHola(String palabra) throws Exception {
        theActorInTheSpotlight().attemptsTo(AgregarPalabra.diccionario(palabra));
    }

    @Then("^verifico que la palabra '(.*)' haya sido agregada$")
    public void verificoQueLaPalabraHayaSidoAgregada(String palabra) throws Exception {
        theActorInTheSpotlight().should(seeThat(Validacion.exitosa(palabra)).orComplainWith(ResultNotWaitedAssertion.class, FAILED_VALIDATION));
    }
}
