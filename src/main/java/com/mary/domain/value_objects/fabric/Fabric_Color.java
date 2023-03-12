package com.mary.domain.value_objects.fabric;

import com.mary.domain.exceptions.FabricException;
import com.mary.domain.value_objects.validators.RegexValidator;
import lombok.Getter;

@Getter
public class Fabric_Color {

    private static final String FABRIC_COLOR_PATTERN = "^#?([a-fA-F0-9]{6}|[a-fA-F0-9]{3})|([a-zA-Z0-9-]+)$";

    private final String value;

    public Fabric_Color(String color) {
        if (color == null || color.isEmpty()) {
            throw new FabricException("Error: El color de la tela no puede ser nulo o vacío.");
        }

        if (!RegexValidator.validateRegex(color, FABRIC_COLOR_PATTERN)) {
            throw new FabricException("Error: El color de la tela no cumple con el formato requerido.");
        }
        this.value = color;
    }
}
