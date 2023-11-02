package co.com.choucair.bancolombia.utest.practica.tasks;

//A TODAS NUESTRAS CLASES QUE SEAN TAREAS (TASK) LE HAREMOS UN OMPLEMENTES TASK

import co.com.choucair.bancolombia.utest.practica.userinterface.ChoucairAcadyPage;
import co.com.choucair.bancolombia.utest.practica.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ChoucairAcadyPage choucairAcademyPage;
    //este metodo siempre nos va a retornar algo
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    //en performAs es donde se ejecutan todas las acciones de nuestra prueba
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage), Click.on(ChoucairLoginPage.LOGIN_BUTTON));
    }
}
