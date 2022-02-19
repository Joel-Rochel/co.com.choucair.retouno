package co.com.choucair.retouno.tasks;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.util.List;


public class Formulario implements Task {

    private List<ColorLibData> data;

    public Formulario(List<ColorLibData> data) {
        this.data = data;
    }

    public static Formulario enterData(List<ColorLibData> data) {
        return Tasks.instrumented(Formulario.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(WebElementQuestion.the(ColorLibFormularioPage.TEXT_VALIDATE), WebElementStateMatchers.isVisible()),
                Enter.theValue(data.get(0).getStrRequired()).into(ColorLibFormularioPage.INPUT_REQUIRED),
                Enter.theValue(data.get(0).getStrEmail()).into(ColorLibFormularioPage.INPUT_EMAIL),
                Enter.theValue(data.get(0).getStrPassword()).into(ColorLibFormularioPage.INPUT_PASSWORD),
                Enter.theValue(data.get(0).getStrCPassword()).into(ColorLibFormularioPage.INPUT_CONFIRM_PASSWORD),
                Enter.theValue(data.get(0).getStrDate()).into(ColorLibFormularioPage.INPUT_DATE),
                Enter.theValue(data.get(0).getStrUrl()).into(ColorLibFormularioPage.INPUT_URL),
                Enter.theValue(data.get(0).getStrDigits()).into(ColorLibFormularioPage.INPUT_DIGITS),
                Enter.theValue(data.get(0).getStrRange()).into(ColorLibFormularioPage.INPUT_RANGE),
                Click.on(ColorLibFormularioPage.CHECKBOX_POLICY),
                Click.on(ColorLibFormularioPage.BUTTON_VALIDATE)
        );
    }
}
