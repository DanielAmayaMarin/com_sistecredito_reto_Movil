package com.sistecredito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sistecredito.ui.UiNavegar.BTN_REGISTRARSE;

public class VerificoRegistoUsuario implements Question<Boolean> {

    private String email;

    public VerificoRegistoUsuario(String email){
        this.email = email;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean estado = false;
        if (BTN_REGISTRARSE.resolveFor(actor).isVisible()){
            estado = BTN_REGISTRARSE.resolveFor(actor).getText().equals(email);
        }
        return estado;
    }

    public static VerificoRegistoUsuario exitoso(String email){
        return new VerificoRegistoUsuario(email);
    }
}
