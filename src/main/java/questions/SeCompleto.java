package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.MainPage.*;

public class SeCompleto implements Question {

    private String  keyWord;

    public SeCompleto(String keyWord) { this.keyWord = keyWord;}

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(COMPLETED_BUTTON));
        boolean complete = KEY_WORD.of(keyWord).resolveFor(actor).isVisible();
        return complete;
    }

    public static SeCompleto laTarea(String palabra){
        return new SeCompleto(palabra);
    }
}
