package com.mary.domain.value_objects.fabric_movement;

import com.mary.domain.exceptions.FabricMovementException;
import lombok.Getter;

@Getter
public enum FabricMovement_Type {
    INCOMING(1, "Entrada"),
    OUTGOING(2, "Salida"),
    RETURNED(3, "Devolución"),
    ADJUSTMENT(4, "Ajuste");

    private final int code;
    private final String name;

    FabricMovement_Type(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static FabricMovement_Type fromCode(int code) {
        for (FabricMovement_Type type : FabricMovement_Type.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null;
    }

    public static FabricMovement_Type fromName(String name) {
        for (FabricMovement_Type type : FabricMovement_Type.values()) {
            if (type.getName().equals(name)) {
                return type;
            }
        }
        throw new FabricMovementException("Error: El tipo de movimiento no es válido");
    }

}
