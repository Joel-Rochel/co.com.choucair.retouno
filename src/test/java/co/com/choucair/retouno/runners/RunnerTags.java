package co.com.choucair.retouno.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/diligenciamiento_block_validation.feature",
        tags = "@Stories",
        glue = "co.com.choucair.retouno.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
