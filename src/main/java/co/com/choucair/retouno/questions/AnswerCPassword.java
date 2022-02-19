package co.com.choucair.retouno.questions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerCPassword implements Question<Boolean> {

    private List<ColorLibData> data;

    public AnswerCPassword(List<ColorLibData> data) {
        this.data = data;
    }

    public static AnswerCPassword toThe(List<ColorLibData> data) {
        return new AnswerCPassword(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String format_cpassword= Text.of(ColorLibFormularioPage.CONFIRM_PASSWORD_FORMAT).viewedBy(actor).asString();
        return data.get(0).getStrCPasswordInvalida().equals(format_cpassword);
    }
}
