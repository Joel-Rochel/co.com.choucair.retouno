package co.com.choucair.retouno.questions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class AnswerUrl implements Question<Boolean> {

    private List<ColorLibData> data;

    public AnswerUrl(List<ColorLibData> data) {
        this.data = data;
    }

    public static AnswerUrl toThe(List<ColorLibData> data) {
        return new AnswerUrl(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String format_url= Text.of(ColorLibFormularioPage.URL_FORMAT).viewedBy(actor).asString();
        return data.get(0).getStrUrlInvalido().equals(format_url);
    }
}
