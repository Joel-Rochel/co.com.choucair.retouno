package co.com.choucair.retouno.stepdefinitions;

import co.com.choucair.retouno.model.ColorLibData;
import co.com.choucair.retouno.questions.*;
import co.com.choucair.retouno.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.bs.I;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ColorLibStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Joel logs in to the colorlib page$")
    public void joelLogsInToTheColorlibPage(List<ColorLibData> data) {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), (Login.onThePage(data)));
    }


    @When("^Enter Block Validation Functionality$")
    public void enterBlockValidationFunctionality() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.inFuction());
    }

    @When("^Enter all the required information$")
    public void enterAllTheRequiredInformation(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.enterData(data));
    }

    @Then("^Check Answer$")
    public void checkAnswer(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));
    }


    @Given("^validate the fields$")
    public void validateTheFields(List<ColorLibData> data) {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.onThePage(data), Ingresar.inFuction());
    }


    @When("^save the form without filling in the fields$")
    public void saveTheFormWithoutFillingInTheFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(FormularioEmpty.enterData());
    }

    @Then("^check the field validation message$")
    public void checkTheFieldValidationMessage(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerEmpty.toThe(data)));
    }


    @Given("^Joel want to verify that the email field is valid$")
    public void joelWantToVerifyThatTheEmailFieldIsValid(List<ColorLibData> data) {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.onThePage(data), Ingresar.inFuction());
    }


    @When("^enter a wrong email in the field$")
    public void enterAWrongEmailInTheField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.enterData(data));
    }

    @Then("^check the validation message in the email field$")
    public void checkTheValidationMessageInTheEmailField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerEmail.toThe(data)));
    }


    @Given("^Joel want to verify that the password field is valid$")
    public void joelWantToVerifyThatThePasswordFieldIsValid(List<ColorLibData> data) {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.onThePage(data), Ingresar.inFuction());
    }


    @When("^enter a wrong password in the field$")
    public void enterAWrongPasswordInTheField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.enterData(data));
    }

    @Then("^check the validation message in the password field$")
    public void checkTheValidationMessageInThePasswordField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPassword.toThe(data)));
    }


    @Given("^Joel want to verify that the confirm password field is valid$")
    public void joelWantToVerifyThatTheConfirmPasswordFieldIsValid(List<ColorLibData> data) {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.onThePage(data), Ingresar.inFuction());
    }


    @When("^enter a wrong confirm password in the field$")
    public void enterAWrongConfirmPasswordInTheField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.enterData(data));
    }

    @Then("^check the validation message in the confirm password field$")
    public void checkTheValidationMessageInTheConfirmPasswordField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCPassword.toThe(data)));
    }


    @Given("^Joel want to verify that the url field is valid$")
    public void joelWantToVerifyThatTheUrlFieldIsValid(List<ColorLibData> data) {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.onThePage(data), Ingresar.inFuction());
    }


    @When("^enter a wrong url in the field$")
    public void enterAWrongUrlInTheField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.enterData(data));
    }

    @Then("^check the validation message in the url field$")
    public void checkTheValidationMessageInTheUrlField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerUrl.toThe(data)));
    }



    @Given("^Joel want to verify that the only digits field is valid$")
    public void joelWantToVerifyThatTheOnlyDigitsFieldIsValid(List<ColorLibData> data) {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.onThePage(data), Ingresar.inFuction());
    }


    @When("^enter a wrong only digits in the field$")
    public void enterAWrongOnlyDigitsInTheField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.enterData(data));
    }

    @Then("^check the validation message in the only digits field$")
    public void checkTheValidationMessageInTheOnlyDigitsField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerDigits.toThe(data)));
    }


    @Given("^Joel want to verify that the range field is valid$")
    public void joelWantToVerifyThatTheRangeFieldIsValid(List<ColorLibData> data) {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Login.onThePage(data), Ingresar.inFuction());
    }


    @When("^enter a wrong only range in the field$")
    public void enterAWrongOnlyRangeInTheField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.enterData(data));
    }

    @Then("^check the validation message in the range field$")
    public void checkTheValidationMessageInTheRangeField(List<ColorLibData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRange.toThe(data)));
    }
}
