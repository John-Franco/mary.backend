package com.mary.domain.value_objects.fabric_movement;

import com.mary.domain.exceptions.FabricMovementException;
import lombok.Getter;

@Getter
public class FabricMovement_Quantity {
    private final int value;

    public FabricMovement_Quantity(int quantity) {
        if (quantity < 0) {
            throw new FabricMovementException("Error: La cantidad del movimiento de tela no puede ser negativa");
        }

        this.value = quantity;
    }
}
