package com.mary.application.exceptions;

public class FabricNotFoundException extends RuntimeException {
    public FabricNotFoundException(Long fabricId) {
        super("No se encontró la tela con id: " + fabricId);
    }
}
