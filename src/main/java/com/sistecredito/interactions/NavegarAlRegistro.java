package com.sistecredito.interactions;

import com.sistecredito.exceptios.Excepciones;
import com.sistecredito.utils.Constantes;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static com.sistecredito.ui.UiNavegar.*;

public class NavegarAlRegistro implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    CerrarModal.go(),
                    Click.on(BTN_MASCULINO),
                    Click.on(BTN_MI_CUENTA),
                    Click.on(BTN_REGISTRARSE),
                    Click.on(BTN_CREAR_CUENTA)
            );
        }catch (RuntimeException ex){
            throw new Excepciones(Excepciones.error(Constantes.INTERACTION_NAVEGARALCARRITO), ex);
        }

    }

    public static NavegarAlRegistro go(){
        return Instrumented.instanceOf(NavegarAlRegistro.class).withProperties();
    }
}
