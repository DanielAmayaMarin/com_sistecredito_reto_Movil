package com.sistecredito.interactions;

import com.sistecredito.exceptios.Excepciones;
import com.sistecredito.utils.Constantes;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import java.util.logging.Logger;
import static com.sistecredito.ui.UiNavegar.BTN_CERRAR_POPUP;

public class CerrarModal implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            do {
                if (BTN_CERRAR_POPUP.resolveFor(actor).isVisible()){
                    actor.attemptsTo(
                            Click.on(BTN_CERRAR_POPUP)
                    );
                    Logger.getAnonymousLogger().info("Modal cerrado");
                    break;
                }
            }while (!BTN_CERRAR_POPUP.resolveFor(actor).isVisible());
        }catch (RuntimeException ex){
            throw new Excepciones(Excepciones.error(Constantes.INTERACTION_CERRARMODAL), ex);
        }

    }

    public static CerrarModal go(){
        return Instrumented.instanceOf(CerrarModal.class).withProperties();
    }
}
