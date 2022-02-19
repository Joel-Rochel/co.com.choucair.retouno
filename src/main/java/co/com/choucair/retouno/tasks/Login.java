package co.com.choucair.retouno.tasks;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    private List<ColorLibData> data;

    public Login(List<ColorLibData> data) {
        this.data = data;
    }

    public static Performable onThePage(List<ColorLibData> data) {
        return Tasks.instrumented(Login.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrUsuario()).into(ColorLibLoginPage.INPUT_NAME),
                Enter.theValue(data.get(0).getStrClave()).into(ColorLibLoginPage.INPUT_PASSWORD),
                Click.on(ColorLibLoginPage.BUTTON_JOIN)
        );


    }
}
