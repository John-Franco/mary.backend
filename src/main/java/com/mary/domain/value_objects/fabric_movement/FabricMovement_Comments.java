package com.mary.domain.value_objects.fabric_movement;

import com.mary.domain.exceptions.FabricMovementException;
import lombok.Getter;

@Getter
public class FabricMovement_Comments {
    private final String value;

    public FabricMovement_Comments(String comments) {
        if (comments == null) {
            throw new FabricMovementException("Error: Los comentarios del movimiento de tela no pueden ser nulos o vacíos.");
        }
        this.value = comments;
    }
}
