package com.sistecredito.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UiAgregarProducto {
    public static final Target BTN_CATEGORIAS = Target.the("Boton categorias")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='Categorías']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CATEGORIA_ZAPATOS(String test){
        return Target.the("Boton categoria zapatos")
                .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='"+test+"']"))
                .locatedForIOS(MobileBy.id(""));
    }

    public static final Target BTN_ElEGIR_ZAPATOS(String test){
        return Target.the("Boton elegir zapatos")
                .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='"+test+"']"))
                .locatedForIOS(MobileBy.id(""));
    }

    public static final Target BTN_TALLA_ZAPATO(String test){
        return Target.the("Boton talla zapatos")
                .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='"+test+"']"))
                .locatedForIOS(MobileBy.id(""));
    }

    public static final Target BTN_COMPRAR = Target.the("Boton comprar zapatos")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/buy_button"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CARRITO = Target.the("Boton carrito compras")
            .locatedForAndroid(MobileBy.xpath("//android.widget.ImageView[@content-desc='Carrito']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target LBL_NOMBRE = Target.the("Label nombre del producto")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/item_desc"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target LBL_TALLA = Target.the("Label talla")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/item_size"))
            .locatedForIOS(MobileBy.id(""));




}
