package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://todomvc.com/examples/angularjs/#/")
public class MainPage extends PageObject {
    public static Target INPUT = Target.the("Cuadro de texto").locatedBy("//input[@placeholder='What needs to be done?']");
    public static Target ACTIVE = Target.the("Palabras activas").locatedBy("//a[@href='#/active']");
    public static Target KEY_WORD = Target.the("Palabras agregadas").locatedBy("//label[text()='{0}']");
}

