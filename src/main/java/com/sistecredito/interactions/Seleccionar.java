package com.sistecredito.interactions;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import com.sistecredito.exceptios.Excepciones;
import com.sistecredito.models.ProductoModel;
import com.sistecredito.utils.Constantes;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.sistecredito.ui.UiAgregarProducto.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Seleccionar implements Interaction {
    private ProductoModel productoModel;

    public Seleccionar(ProductoModel productoModel){
        this.productoModel = productoModel;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_CATEGORIAS, isVisible()).forNoMoreThan(20).seconds(),
                    Click.on(BTN_CATEGORIAS),
                    WaitUntil.the(BTN_CATEGORIA_ZAPATOS(productoModel.getCategoria()), isVisible()).forNoMoreThan(10).seconds(),
                    Tap.on(BTN_CATEGORIA_ZAPATOS(productoModel.getCategoria())),
                    WaitUntil.the(BTN_ElEGIR_ZAPATOS(productoModel.getProducto()), isVisible()).forNoMoreThan(10).seconds(),
                    Tap.on(BTN_ElEGIR_ZAPATOS(productoModel.getProducto())),
                    WaitUntil.the(BTN_TALLA_ZAPATO(productoModel.getTalla()), isVisible()).forNoMoreThan(10).seconds(),
                    Tap.on(BTN_TALLA_ZAPATO(productoModel.getTalla())),
                    Tap.on(BTN_COMPRAR),
                    TakeScreenshot.asEvidence(),
                    WaitUntil.the(BTN_CARRITO, isVisible()).forNoMoreThan(20).seconds(),
                    Tap.on(BTN_CARRITO)
            );
        }catch (RuntimeException ex){
            throw new Excepciones(Excepciones.error(Constantes.INTERACTION_SELECCIONAR), ex);
        }
    }

    public static Seleccionar aleatorio(ProductoModel productoModel) {
        return Instrumented.instanceOf(Seleccionar.class).withProperties(productoModel);
    }
}
