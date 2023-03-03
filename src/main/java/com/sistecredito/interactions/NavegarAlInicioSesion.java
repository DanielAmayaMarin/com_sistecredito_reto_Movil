package com.sistecredito.interactions;

import com.sistecredito.exceptios.Excepciones;
import com.sistecredito.utils.Constantes;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.sistecredito.ui.UiInicioSesion.BTN_ENTRAR;
import static com.sistecredito.ui.UiInicioSesion.BTN_INGRESAR_CON_EMAIL;
import static com.sistecredito.ui.UiNavegar.BTN_MASCULINO;
import static com.sistecredito.ui.UiNavegar.BTN_MI_CUENTA;

public class NavegarAlInicioSesion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    CerrarModal.go(),
                    Click.on(BTN_MASCULINO),
                    Click.on(BTN_MI_CUENTA),
                    Click.on(BTN_ENTRAR),
                    Click.on(BTN_INGRESAR_CON_EMAIL)
            );
        }catch (RuntimeException ex){
            throw new Excepciones(Excepciones.error(Constantes.INTERACTION_NAVEGARALINICIOSESION), ex);
        }

    }

    public static NavegarAlInicioSesion go(){
        return Instrumented.instanceOf(NavegarAlInicioSesion.class).withProperties();
    }
}
