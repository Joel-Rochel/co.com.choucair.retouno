package co.com.choucair.retouno.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ColorLibIngresarPage extends PageObject {
    public static final Target SELECT_FORMS = Target.the("Seleccionar el menu de formularios")
            .located(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a"));
    public static final Target SELECT_FORM_VALIDATION = Target.the("Seleccionar el formulario de validacion")
            .located(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/ul/li[2]/a"));
}
