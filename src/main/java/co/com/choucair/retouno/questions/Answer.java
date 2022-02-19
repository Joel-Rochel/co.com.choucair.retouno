package co.com.choucair.retouno.questions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<ColorLibData> data;

    public Answer(List<ColorLibData> data) {
        this.data = data;
    }

    public static Answer toThe(List<ColorLibData> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String requiered_validation = Text.of(ColorLibFormularioPage.INPUT_REQUIRED).viewedBy(actor).asString();
        String email_validation = Text.of(ColorLibFormularioPage.INPUT_EMAIL).viewedBy(actor).asString();
        String password_validation = Text.of(ColorLibFormularioPage.INPUT_REQUIRED).viewedBy(actor).asString();
        String cpassword_validation = Text.of(ColorLibFormularioPage.INPUT_REQUIRED).viewedBy(actor).asString();
        String date_validation = Text.of(ColorLibFormularioPage.INPUT_REQUIRED).viewedBy(actor).asString();
        String url_validation = Text.of(ColorLibFormularioPage.INPUT_REQUIRED).viewedBy(actor).asString();
        String digits_validation = Text.of(ColorLibFormularioPage.INPUT_REQUIRED).viewedBy(actor).asString();
        String range_validation = Text.of(ColorLibFormularioPage.INPUT_REQUIRED).viewedBy(actor).asString();

        if (data.get(0).getStrTextValidation().equals(requiered_validation) && data.get(0).getStrTextValidation().equals(email_validation) &&
                data.get(0).getStrTextValidation().equals(password_validation) && data.get(0).getStrTextValidation().equals(cpassword_validation) &&
                data.get(0).getStrTextValidation().equals(date_validation) && data.get(0).getStrTextValidation().equals(url_validation) &&
                data.get(0).getStrTextValidation().equals(digits_validation) && data.get(0).getStrTextValidation().equals(range_validation)){
            return true;
        }else {
            return false;
        }

    }
}
