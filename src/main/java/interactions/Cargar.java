package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.MainPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cargar implements Interaction {
    private MainPage mainPage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(mainPage));
    }
    public static Cargar laPagina (){
       return instrumented(Cargar.class);
    }
}
