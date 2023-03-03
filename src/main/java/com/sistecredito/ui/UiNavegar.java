package com.sistecredito.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UiNavegar {

    public static final Target BTN_CERRAR_POPUP = Target.the("Boton cerrar modal")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/com_braze_inappmessage_modal_close_button"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_MASCULINO = Target.the("Boton categoria Masculino")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='Masculino']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_MI_CUENTA = Target.the("Boton Mi Cuenta")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='Mi Cuenta']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_REGISTRARSE = Target.the("Boton registrarse")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/account_email"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CREAR_CUENTA = Target.the("Boton crear cuenta")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/create_account"))
            .locatedForIOS(MobileBy.id(""));
}
