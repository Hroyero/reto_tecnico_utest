package co.com.choucair.bancolombia.utest.practica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button than show us the form to login").located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[1]/a[1]"));
    public static final Target INPUT_USER = Target.the("where do we write the user").located(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/main[1]/section[1]/div[1]/input[1]"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));
    public static final Target  MEMORY_CLICK = Target.the("Button to remember user").located(By.id("rememberMe"));
    public static final Target SIGN_IN_BUTTON = Target.the("Button for sign in").located(By.id("kc-login"));


}
