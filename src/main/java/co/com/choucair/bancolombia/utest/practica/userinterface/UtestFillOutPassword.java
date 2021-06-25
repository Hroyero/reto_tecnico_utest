package co.com.choucair.bancolombia.utest.practica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFillOutPassword {
    public static final Target INPUT_PASSWORD = Target.the("where we write the password").located(By.cssSelector("#password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where we write the confirm password").located(By.cssSelector("#confirmPassword"));
    public static final Target CHECK_STAY_INFORME = Target.the("check button the stay inform").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/span[1]"));
    public static final Target CHECK_ACCEPT_THE_TERM_OF_USER = Target.the("check button the term of use").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));
    public static final Target CHECK_ACCEPT_THE_SECURITY_POLICIES = Target.the("check button the accept the security policies").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));

}
