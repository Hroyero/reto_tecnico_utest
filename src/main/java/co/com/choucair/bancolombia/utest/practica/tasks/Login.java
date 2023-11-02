package co.com.choucair.bancolombia.utest.practica.tasks;

import co.com.choucair.bancolombia.utest.practica.model.AcademyChoucairData;
import co.com.choucair.bancolombia.utest.practica.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.TheValue;

import java.util.List;

public class Login implements Task {
    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    String strUser;
    String strPassword;

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(strUser).into(ChoucairLoginPage.INPUT_USER),
                SendKeys.of(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.MEMORY_CLICK),
                Click.on(ChoucairLoginPage.SIGN_IN_BUTTON));
    }
}
