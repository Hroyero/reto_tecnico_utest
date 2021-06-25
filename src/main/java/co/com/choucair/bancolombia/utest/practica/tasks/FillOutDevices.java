package co.com.choucair.bancolombia.utest.practica.tasks;

import co.com.choucair.bancolombia.utest.practica.userinterface.UtestFillOutDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.bancolombia.utest.practica.userinterface.UtestFillOutDevices.*;

public class FillOutDevices implements Task {
    private UtestFillOutDevices utestFillOutDevices;

    public static FillOutDevices onThePage() {
        return Tasks.instrumented(FillOutDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_CLOSE_AUTODETECTED),
                         Click.on(INPUT_LIST_COMPUTE),
                         Click.on(SELECT_COMPUTER),
                         Click.on(INPUT_LIST_VERSION),
                         Click.on(SELECT_VERSION),
                         Click.on(INPUT_LIST_LANGUAGE),
                         Click.on(SELECT_LANGUAGE),
                         Click.on(BUTTON_NEXT_LAST_SETUP));
    }
}
