package com.mary.domain.value_objects.fabric;

import com.mary.domain.exceptions.FabricException;
import lombok.Getter;

@Getter
public class Fabric_Width {
    private final int value;

    public Fabric_Width(int width) {
        if (width < 0) {
            throw new FabricException("Error: El ancho de la tela no puede ser negativo.");
        }
        this.value = width;
    }
}
