package co.com.choucair.retouno.questions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.userinterface.ColorLibFormularioEmptyPage;
import co.com.choucair.retouno.userinterface.ColorLibFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerEmpty implements Question<Boolean> {

    private List<ColorLibData> data;

    public AnswerEmpty(List<ColorLibData> data) {
        this.data = data;
    }

    public static AnswerEmpty toThe(List<ColorLibData> data) {
        return new AnswerEmpty(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String requiered_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_REQUIRED).viewedBy(actor).asString();
        String email_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_EMAIL).viewedBy(actor).asString();
        String password_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_PASSWORD).viewedBy(actor).asString();
        String cpassword_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_CONFIRM_PASSWORD).viewedBy(actor).asString();
        String date_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_DATE).viewedBy(actor).asString();
        String url_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_URL).viewedBy(actor).asString();
        String digits_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_DIGITS).viewedBy(actor).asString();
        String range_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_RANGE).viewedBy(actor).asString();
        String checkbox_validate = Text.of(ColorLibFormularioEmptyPage.VALIDATE_CHECKBOX).viewedBy(actor).asString();

        if (data.get(0).getStrCampoRequerido().equals(requiered_validate) && data.get(0).getStrCampoRequerido().equals(email_validate) &&
                data.get(0).getStrCampoRequerido().equals(password_validate) && data.get(0).getStrCampoRequerido().equals(cpassword_validate) &&
                data.get(0).getStrCampoRequerido().equals(date_validate) && data.get(0).getStrCampoRequerido().equals(url_validate) &&
                data.get(0).getStrCampoRequerido().equals(digits_validate) && data.get(0).getStrCampoRequerido().equals(range_validate) &&
                data.get(0).getStrCampoRequerido().equals(checkbox_validate)){
            return true;
        }else {
            return false;
        }

    }
}
