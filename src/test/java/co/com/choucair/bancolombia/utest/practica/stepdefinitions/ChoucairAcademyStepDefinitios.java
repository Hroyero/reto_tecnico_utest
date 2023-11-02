package co.com.choucair.bancolombia.utest.practica.stepdefinitions;

import co.com.choucair.bancolombia.utest.practica.model.AcademyChoucairData;
import co.com.choucair.bancolombia.utest.practica.question.Answer;
import co.com.choucair.bancolombia.utest.practica.tasks.Login;
import co.com.choucair.bancolombia.utest.practica.tasks.OpenUp;
import co.com.choucair.bancolombia.utest.practica.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChoucairAcademyStepDefinitios {
    //Se encarga de prepar el Scenario a nuestro Actor
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than hollmans wants to lear automation at the academy choucair$")
    public void thanHollmansWantsToLearAutomationAtTheAcademyChoucair() {
    //estoy dentro de un metodo
        //para estos metodos usamos wasAbleTo y attemptsTo (Ambas cumples
        // perfectamente pero wasAbleTo siempre se ejecuta en el Given el attempt con los demas
        // when etc ya que el given es una precondicion)
        OnStage.theActorCalled("Hollmans").wasAbleTo(OpenUp.thePage());
    }


    @When("^he search for the course introduction to utest on the choucair academy Platform$")
    public void heSearchForTheCourseIntroductionToUTestOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)throws Exception {
        theActorInTheSpotlight().attemptsTo(Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()),Search.the());
    }

    @Then("^he finds the course called (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
