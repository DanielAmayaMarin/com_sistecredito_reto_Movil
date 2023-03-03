package com.sistecredito.exceptios;

public class Excepciones extends AssertionError{

    public static final String EL_CORREO_NO_ES_EL_ESPERADO = "El correo no es el esperado";
    public static final String LOS_DATOS_DEL_CARRITO_NO_SON_LOS_CORRECTOS = "Los datos del carrito no son los correctos";
    private static final String ERROR = "Error desde la ";
    public Excepciones(String message, Throwable cause){
        super(message, cause);
    }
    public static String error(String donde) {
        return ERROR + donde;
    }
}
