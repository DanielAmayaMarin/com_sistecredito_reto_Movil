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

import static com.sistecredito.ui.UiFormulario.*;

public class FormularioRegistro implements Interaction {

    private PersonaModel personaModel;

    public FormularioRegistro(PersonaModel personaModel){
        this.personaModel = personaModel;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(personaModel.getCorreoelectronico()).into(TXT_EMAIL),
                    Enter.theValue(personaModel.getContrasena()).into(TXT_CONTRASEÑA),
                    Enter.theValue(personaModel.getContrasena()).into(TXT_REPETIR_CONTRASEÑA),
                    Tap.on(DPD_TIPO_DOCUMENTO),
                    Tap.on(RB_CEDULA),
                    Enter.theValue(personaModel.getNumerodocumento()).into(TXT_NUMERO_DOCUMENTO),
                    Enter.theValue(personaModel.getNombres()).into(TXT_NOMBRE),
                    Enter.theValue(personaModel.getApellidos()).into(TXT_APELLIDO),
                    Enter.theValue(personaModel.getFechanacimiento()).into(TXT_FECHA_NACIMIENTO),
                    Tap.on(DPD_GENERO),
                    Tap.on(RB_MASCULINO),
                    TakeScreenshot.asEvidence(),
                    Tap.on(BTN_GUARDAR)
            );
        }catch (RuntimeException ex){
            throw new Excepciones(Excepciones.error(Constantes.INTERACTION_FORMULARIO), ex);
        }

    }

    public static FormularioRegistro registro(PersonaModel personaModel){
        return Instrumented.instanceOf(FormularioRegistro.class).withProperties(personaModel);
    }
}
