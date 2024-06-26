package com.sergiobogarin.conversordedivisas.exceptions;

public class ErrorCodigoDeDivisaIncorrecta extends RuntimeException {
    private String mensaje;

    public ErrorCodigoDeDivisaIncorrecta(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
