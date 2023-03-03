package com.sistecredito.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UiInicioSesion {

    public static final Target BTN_ENTRAR= Target.the("Boton entrar inicio sesion")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='Entrar']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_INGRESAR_CON_EMAIL = Target.the("Boton ingresar con Email")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/login_button"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_EMAIL = Target.the("Text Box Email")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/user_identification"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_CONTRASEÑA = Target.the("Text Box Contraseña")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/user_password"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_INICIAR_SESION = Target.the("Boton iniciar sesion")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/login_or_create_button"))
            .locatedForIOS(MobileBy.id(""));

}
