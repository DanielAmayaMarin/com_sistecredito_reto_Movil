package com.sistecredito.tasks;

import com.sistecredito.interactions.FormularioInicioSesion;
import com.sistecredito.interactions.NavegarAlInicioSesion;
import com.sistecredito.models.PersonaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IniciarSesion implements Task {

    private PersonaModel personaModel;

    public IniciarSesion(PersonaModel personaModel){
        this.personaModel = personaModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavegarAlInicioSesion.go(),
                FormularioInicioSesion.go(personaModel)
        );
    }

    public static IniciarSesion go(PersonaModel personaModel){
        return Tasks.instrumented(IniciarSesion.class, personaModel);
    }
}
