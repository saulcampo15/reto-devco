package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.assertions.ResultNotWaitedAssertion;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.SeCompleto;
import tasks.AgregarPalabra;

import static exceptions.assertions.ResultNotWaitedAssertion.FAILED_TO_COMPLETE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterface.MainPage.COMPLETE;

public class Completar {

    @Before
    public void setHabilidadesActor() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^completo la palabra clave '(.*)'$")
    public void completoLaPalabraClaveOtra(String palabra) throws Exception {
        theActorInTheSpotlight().attemptsTo(AgregarPalabra.diccionario(palabra),
                Click.on(COMPLETE));
    }

    @Then("^verifico que la palabra '(.*)' haya sido completada$")
    public void verificoQueLaPalabraOtraHayaSidoCompletada(String palabra) throws Exception {
        theActorInTheSpotlight().should(seeThat(SeCompleto.laTarea(palabra)).orComplainWith(ResultNotWaitedAssertion.class, FAILED_TO_COMPLETE));
    }
}
