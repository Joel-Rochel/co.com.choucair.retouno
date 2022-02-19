package co.com.choucair.retouno.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorLibFormularioEmptyPage extends PageObject {
    public static final Target VALIDATE_REQUIRED = Target.the("Mensaje para validar el campo para ingresar el nombre")
            .located(By.id("required2-error"));
    public static final Target VALIDATE_EMAIL = Target.the("Mensaje para validar el campo para ingresar el email")
            .located(By.id("email2-error"));
    public static final Target VALIDATE_PASSWORD = Target.the("Mensaje para validar el campo para ingresar la clave")
            .located(By.id("password2-error"));
    public static final Target VALIDATE_CONFIRM_PASSWORD = Target.the("Mensaje para validar el campo para confirmar la clave")
            .located(By.id("confirm_password2-error"));
    public static final Target VALIDATE_DATE = Target.the("Mensaje para validar el campo para ingresar la fecha")
            .located(By.id("date2-error"));
    public static final Target VALIDATE_URL = Target.the("Mensaje para validar el campo para ingresar la Url")
            .located(By.id("url2-error"));
    public static final Target VALIDATE_DIGITS = Target.the("Mensaje para validar el campo para ingresar los digitos")
            .located(By.id("digits-error"));
    public static final Target VALIDATE_RANGE = Target.the("Mensaje para validar el campo para ingresar el rango")
            .located(By.id("range-error"));
    public static final Target VALIDATE_CHECKBOX = Target.the("Mensaje para validar que marcamos para aceptar las politicas")
            .located(By.id("agree2-error"));
}
