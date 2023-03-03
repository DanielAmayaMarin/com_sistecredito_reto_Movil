package com.sistecredito.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UiFormulario {

    public static final Target TXT_EMAIL = Target.the("Text Box Email")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_email"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_CONTRASEÑA = Target.the("Text Box Contraseña")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_password"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_REPETIR_CONTRASEÑA = Target.the("Text Box Repetir Contraseña")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_password_confirm"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target DPD_TIPO_DOCUMENTO = Target.the("Dropdown Tipo Documento")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_document_type"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target RB_CEDULA = Target.the("Radio Button Cedula")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='CC']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Text Box Numero Documento")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_identification"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_NOMBRE = Target.the("Text Box Nombre")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_first_name"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_APELLIDO = Target.the("Text Box Apellido")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_last_name"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_FECHA_NACIMIENTO = Target.the("Text Box Fecha Nacimiento")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_birthday"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target DPD_GENERO = Target.the("Radio Button Genero")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/form_gender"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target RB_MASCULINO = Target.the("")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='Masculino']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_GUARDAR = Target.the("Boton Crear Cuenta")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/register_button"))
            .locatedForIOS(MobileBy.id(""));

}
