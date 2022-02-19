package co.com.choucair.retouno.questions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerEmail implements Question<Boolean> {

    private List<ColorLibData> data;

    public AnswerEmail(List<ColorLibData> data) {
        this.data = data;
    }

    public static AnswerEmail toThe(List<ColorLibData> data) {
        return new AnswerEmail(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String format_email= Text.of(ColorLibFormularioPage.EMAIL_FORMAT).viewedBy(actor).asString();
        return data.get(0).getStrEmailInvalido().equals(format_email);
    }
}
