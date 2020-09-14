package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.MainPage.ACTIVE;
import static userinterface.MainPage.KEY_WORD;

public class Validacion implements Question {

    private String keyWord;
    public Validacion(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(ACTIVE));
        boolean validate = KEY_WORD.of(keyWord).resolveFor(actor).isVisible();
        return validate;
    }

    public static Validacion exitosa (String palabra){
        return new Validacion(palabra);
    };
}
