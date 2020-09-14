package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.MainPage.INPUT;

public class AgregarPalabra implements Task {
    private String word;
    public AgregarPalabra(String palabra){
        this.word = palabra;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(word).into(INPUT).thenHit(Keys.ENTER));
    }
    public static AgregarPalabra diccionario (String word){
        return instrumented(AgregarPalabra.class, word);
    }
}
