package co.com.choucair.bancolombia.utest.practica.tasks;

import co.com.choucair.bancolombia.utest.practica.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search implements Task {




    public static Search the() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_COURSE),
                        Click.on(SearchCoursePage.BUTTON_TAKE_COURSE));
    }
}
