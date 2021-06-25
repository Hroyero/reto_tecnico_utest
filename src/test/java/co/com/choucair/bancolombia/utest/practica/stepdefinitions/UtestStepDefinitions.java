package co.com.choucair.bancolombia.utest.practica.stepdefinitions;

import co.com.choucair.bancolombia.utest.practica.model.UtestData;
import co.com.choucair.bancolombia.utest.practica.question.Answer;
import co.com.choucair.bancolombia.utest.practica.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^hollmans wants to register in utest$")
    public void hollmansWantsToRegisterInUtest() {
        theActorCalled("Hollmans").wasAbleTo(OpenUp.thePage(),
                RegisterLink.inUtest());
    }


    @When("^he search for the option to register and fill the registration form$")
    public void heSearchForTheOptionToRegisterAndFillTheRegistrationForm(List<UtestData> utestData) throws Exception {
        theActorInTheSpotlight().attemptsTo(FillOutAboutYourselft.onThePage(utestData),
                                            FillOutAddress.onThePage(utestData),
                                            FillOutDevices.onThePage(),
                                            FillOutPassword.onThePage(utestData));
    }

    @Then("^he registers on the page$")
    public void heRegistersOnThePage(List<UtestData> utestData) throws Exception{
        theActorInTheSpotlight().should(seeThat(Answer.toThe(utestData.get(0).getStrRegistered())));
    }


}
