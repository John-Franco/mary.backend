package com.mary.domain.value_objects.fabric;

import com.mary.domain.exceptions.FabricException;
import lombok.Getter;

@Getter
public class Fabric_Length {
    private final int value;

    public Fabric_Length(int length) {
        if (length < 0) {
            throw new FabricException("Error: El largo de la tela no puede ser negativo.");
        }
        this.value = length;
    }
}
