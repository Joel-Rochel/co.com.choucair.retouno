package co.com.choucair.retouno.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorLibFormularioPage extends PageObject {
    public static final Target INPUT_REQUIRED = Target.the("Campo para ingresar el nombre")
            .located(By.id("required2"));
    public static final Target INPUT_EMAIL = Target.the("Campo para ingresar el email")
            .located(By.id("email2"));
    public static final Target INPUT_PASSWORD = Target.the("Campo para ingresar la clave")
            .located(By.id("password2"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Campo para confirmar la clave")
            .located(By.id("confirm_password2"));
    public static final Target INPUT_DATE = Target.the("Campo para ingresar la fecha")
            .located(By.id("date2"));
    public static final Target INPUT_URL = Target.the("Campo para ingresar la Url")
            .located(By.xpath("//input[@name='url2']"));
    public static final Target INPUT_DIGITS = Target.the("Campo para ingresar los digitos")
            .located(By.id("digits"));
    public static final Target INPUT_RANGE = Target.the("Campo para ingresar el rango")
            .located(By.id("range"));
    public static final Target CHECKBOX_POLICY = Target.the("Marcamos para aceptar las politicas")
            .located(By.id("agree2"));
    public static final Target BUTTON_VALIDATE = Target.the("Boton para validar la informacion")
            .located(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div/form/div[10]/input"));
    public static final Target TEXT_VALIDATE = Target.the("Texto de validacion")
            .located(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/header/h5"));
    public static final Target EMAIL_FORMAT = Target.the("Correo invalido")
            .located(By.id("email2-error"));
    public static final Target PASSWORD_FORMAT = Target.the("Clave invalida")
            .located(By.id("password2-error"));
    public static final Target CONFIRM_PASSWORD_FORMAT = Target.the("Las claves no son iguales")
            .located(By.id("confirm_password2-error"));
    public static final Target URL_FORMAT = Target.the("Url invalida")
            .located(By.id("url2-error"));
    public static final Target DIGITS_FORMAT = Target.the("Digitos invalidos")
            .located(By.id("digits-error"));
    public static final Target RANGE_FORMAT = Target.the("Rango invalido")
            .located(By.id("range-error"));

}