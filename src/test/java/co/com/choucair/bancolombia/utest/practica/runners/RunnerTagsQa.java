package co.com.choucair.bancolombia.utest.practica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/acadamyChoucair.feature",
                tags = "@stories",
                glue = "co.com.choucair.bancolombia.utest.practica.stepdefinitions",
                snippets = SnippetType.CAMELCASE)

public class RunnerTagsQa {


}
