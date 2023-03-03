package com.sistecredito.questions;

import com.sistecredito.models.ProductoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sistecredito.ui.UiAgregarProducto.LBL_NOMBRE;
import static com.sistecredito.ui.UiAgregarProducto.LBL_TALLA;

public class ValidarProducto implements Question<Boolean> {

    private ProductoModel producto;

    public ValidarProducto(ProductoModel producto){
        this.producto = producto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean estado = false;
        if (LBL_NOMBRE.resolveFor(actor).isVisible()){
            estado = LBL_NOMBRE.resolveFor(actor).getText().equals(producto.getProducto()) && LBL_TALLA.resolveFor(actor).getText().equals(producto.getTalla());
        }
        return estado;
    }

    public static ValidarProducto enElCarrito(ProductoModel productoModel){
        return new ValidarProducto(productoModel);
    }
}
