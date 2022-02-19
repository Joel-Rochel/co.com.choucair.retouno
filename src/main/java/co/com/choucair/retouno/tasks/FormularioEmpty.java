package co.com.choucair.retouno.tasks;

import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FormularioEmpty implements Task {

    public static FormularioEmpty enterData() {
        return Tasks.instrumented(FormularioEmpty.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ColorLibFormularioPage.BUTTON_VALIDATE));
    }
}
