package co.com.choucair.retouno.questions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerPassword implements Question<Boolean> {

    private List<ColorLibData> data;

    public AnswerPassword(List<ColorLibData> data) {
        this.data = data;
    }

    public static AnswerPassword toThe(List<ColorLibData> data) {
        return new AnswerPassword(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String format_password= Text.of(ColorLibFormularioPage.PASSWORD_FORMAT).viewedBy(actor).asString();
        String format_cpassword= Text.of(ColorLibFormularioPage.CONFIRM_PASSWORD_FORMAT).viewedBy(actor).asString();

        if (data.get(0).getStrPasswordInvalida().equals(format_password) && data.get(0).getStrCPasswordInvalida().equals(format_cpassword)){
            return true;
        }else {
            return false;
        }
    }
}
