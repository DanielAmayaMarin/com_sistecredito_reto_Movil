package com.sistecredito.stepsdefinitions;

import com.choucair.moviles.app.tasks.AbreLaApp;
import com.sistecredito.exceptios.Excepciones;
import com.sistecredito.models.PersonaModel;
import com.sistecredito.models.ProductoModel;
import com.sistecredito.questions.ValidarProducto;
import com.sistecredito.tasks.IniciarSesion;
import com.sistecredito.tasks.SeleccionarProducto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStepdefinition {

    @Given("^(.*) inicio sesión en la app de Dafiti$")
    public void danielInicioSesiónEnLaAppDeDafiti(String actor, List<PersonaModel> personaModels) {
        OnStage.theActorCalled(actor).wasAbleTo(
                AbreLaApp.exitosamente(),
                IniciarSesion.go(personaModels.get(0))
        );
    }


    @When("^selecciono el producto al carrito$")
    public void seleccionoElProductoAlCarrito(List<ProductoModel> productoModels) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProducto.exitoso(productoModels.get(0))
        );
    }

    @Then("^Válido que el producto seleccionado exista$")
    public void válidoQueElProductoSeleccionadoExista(List<ProductoModel> productoModels) {
        theActorInTheSpotlight().should(seeThat(
                ValidarProducto.enElCarrito(productoModels.get(0)))
                .orComplainWith(Excepciones.class,
                        Excepciones.LOS_DATOS_DEL_CARRITO_NO_SON_LOS_CORRECTOS)
        );
    }
}
