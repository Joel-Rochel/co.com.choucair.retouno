package co.com.choucair.retouno.questions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerDigits implements Question<Boolean> {

    List<ColorLibData> data;

    public AnswerDigits(List<ColorLibData> data) {
        this.data = data;
    }

    public static AnswerDigits toThe(List<ColorLibData> data) {
       return new AnswerDigits(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String format_digits= Text.of(ColorLibFormularioPage.DIGITS_FORMAT).viewedBy(actor).asString();
        return data.get(0).getStrDigitsInvalido().equals(format_digits);
    }
}
