package co.com.choucair.retouno.questions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerRange implements Question<Boolean> {

    private List<ColorLibData> data;

    public AnswerRange(List<ColorLibData> data) {
        this.data = data;
    }

    public static AnswerRange toThe(List<ColorLibData> data) {
        return new AnswerRange(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String format_range= Text.of(ColorLibFormularioPage.RANGE_FORMAT).viewedBy(actor).asString();
        return data.get(0).getStrRangeInvalido().equals(format_range);
    }
}
