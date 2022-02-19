package co.com.choucair.retouno.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorLibLoginPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("Campo para ingresar el nombre de usuario")
            .located(By.xpath("/html/body/div/div[2]/div[1]/form/input[1]"));
    public static final Target INPUT_PASSWORD = Target.the("Campo para ingresar el nombre del usuario")
            .located(By.xpath("/html/body/div/div[2]/div[1]/form/input[2]"));
    public static final Target BUTTON_JOIN = Target.the("Campo para ingresar el nombre del usuario")
            .located(By.xpath("/html/body/div/div[2]/div[1]//button"));
}
