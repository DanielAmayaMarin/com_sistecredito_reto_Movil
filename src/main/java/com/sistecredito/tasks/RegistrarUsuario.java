package com.sistecredito.tasks;

import com.sistecredito.interactions.FormularioRegistro;
import com.sistecredito.interactions.NavegarAlRegistro;
import com.sistecredito.models.PersonaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class RegistrarUsuario implements Task {

    private PersonaModel personaModel;

    public RegistrarUsuario(PersonaModel personaModel){
        this.personaModel = personaModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavegarAlRegistro.go(),
                FormularioRegistro.registro(personaModel)
        );
    }

    public static RegistrarUsuario exitoso(PersonaModel personaModel){
        return Tasks.instrumented(RegistrarUsuario.class, personaModel);
    }
}
