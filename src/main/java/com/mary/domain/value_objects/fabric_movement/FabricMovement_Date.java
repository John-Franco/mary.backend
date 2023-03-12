package com.mary.domain.value_objects.fabric_movement;

import com.mary.domain.exceptions.FabricMovementException;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class FabricMovement_Date {

    private final LocalDate value;

    public FabricMovement_Date(LocalDate date) {
        if (date == null) {
            throw new FabricMovementException("Error: La fecha del movimiento de tela no puede ser nula o vacía.");
        }
        this.value = date;
    }
}
