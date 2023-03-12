package com.mary.domain.value_objects.fabric_movement;

import com.mary.domain.exceptions.FabricMovementException;
import lombok.Getter;

@Getter
public class FabricMovement_Id {

    private final Long value;

    public FabricMovement_Id(Long id) {
        if (id == null) {
            throw new FabricMovementException("Error: El id del movimiento de tela no puede ser nulo o vacío.");
        }
        this.value = id;
    }
}
