package com.sistecredito.stepsdefinitions;


import com.choucair.moviles.app.tasks.AbreLaApp;
import com.sistecredito.exceptios.Excepciones;
import com.sistecredito.models.PersonaModel;
import com.sistecredito.questions.VerificoRegistoUsuario;
import com.sistecredito.tasks.RegistrarUsuario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepdefinition {

    @Given("^(.*) abre la app de Dafiti$")
    public void danielAbreLaAppDeDafiti(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(
                AbreLaApp.exitosamente()
        );
    }

    @When("^Ingreso los datos de registro$")
    public void ingresoLosDatosDeRegistro(List<PersonaModel> personaModels) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.exitoso(personaModels.get(0))
        );
    }

    @Then("^válido que el registro sea exitoso (.*)$")
    public void válidoQueElRegistroSeaExitoso(String correo) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerificoRegistoUsuario.exitoso(correo))
                        .orComplainWith(Excepciones.class,
                                Excepciones.EL_CORREO_NO_ES_EL_ESPERADO)
        );

    }
}
