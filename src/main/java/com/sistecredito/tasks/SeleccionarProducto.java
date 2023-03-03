package com.sistecredito.tasks;

import com.sistecredito.interactions.Seleccionar;
import com.sistecredito.models.ProductoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarProducto implements Task {

    private ProductoModel productoModel;

    public SeleccionarProducto(ProductoModel productoModel){
        this.productoModel = productoModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Seleccionar.aleatorio(productoModel)
        );
    }

    public static SeleccionarProducto exitoso(ProductoModel productoModel){
        return Tasks.instrumented(SeleccionarProducto.class, productoModel);
    }
}
