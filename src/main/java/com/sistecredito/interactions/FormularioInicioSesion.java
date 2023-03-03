package com.sistecredito.interactions;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import com.sistecredito.exceptios.Excepciones;
import com.sistecredito.models.PersonaModel;
import com.sistecredito.utils.Constantes;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import static com.sistecredito.ui.UiInicioSesion.*;

public class FormularioInicioSesion implements Interaction {

    private PersonaModel personaModel;

    public FormularioInicioSesion(PersonaModel personaModel){
        this.personaModel = personaModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(personaModel.getCorreoelectronico()).into(TXT_EMAIL),
                    Enter.theValue(personaModel.getContrasena()).into(TXT_CONTRASEÑA),
                    TakeScreenshot.asEvidence(),
                    Tap.on(BTN_INICIAR_SESION)
            );
        }catch (RuntimeException ex){
            throw new Excepciones(Excepciones.error(Constantes.INTERACTION_FORMULARIOINICIOSESION), ex);
        }

    }

    public static FormularioInicioSesion go(PersonaModel personaModel){
        return Instrumented.instanceOf(FormularioInicioSesion.class).withProperties(personaModel);
    }
}
