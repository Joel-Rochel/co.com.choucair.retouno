package co.com.choucair.retouno.tasks;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibIngresarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.util.List;

public class Ingresar implements Task {

        public static Ingresar inFuction() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(WebElementQuestion.the(ColorLibIngresarPage.SELECT_FORMS), WebElementStateMatchers.isVisible()),
                Click.on(ColorLibIngresarPage.SELECT_FORMS),
                Click.on(ColorLibIngresarPage.SELECT_FORM_VALIDATION)
        );
    }
}
