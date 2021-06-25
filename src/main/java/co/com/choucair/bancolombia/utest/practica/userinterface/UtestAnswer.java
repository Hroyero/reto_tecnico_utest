package co.com.choucair.bancolombia.utest.practica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestAnswer {
    public static final Target  MESSAGE_SUCCEFUL = Target.the("Extract welcome to utest").located(By.xpath("//span[contains(text(),'Complete Setup')]"));
}
