package co.com.choucair.bancolombia.utest.practica.tasks;

import co.com.choucair.bancolombia.utest.practica.model.UtestData;
import co.com.choucair.bancolombia.utest.practica.userinterface.UtestFillOutPassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.bancolombia.utest.practica.userinterface.UtestFillOutPassword.*;

public class FillOutPassword implements Task {
    private UtestFillOutPassword utestFillOutPassword;
    public FillOutPassword(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    List<UtestData> utestData;
    public static FillOutPassword onThePage(List<UtestData> utestData) {
        return Tasks.instrumented(FillOutPassword.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(utestData.get(0).getStrConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_STAY_INFORME),
                Click.on(CHECK_ACCEPT_THE_TERM_OF_USER),
                Click.on(CHECK_ACCEPT_THE_SECURITY_POLICIES));
    }
}
