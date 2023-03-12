package com.mary.domain.value_objects.fabric;

import com.mary.domain.exceptions.FabricException;
import com.mary.domain.value_objects.validators.RegexValidator;
import lombok.Getter;

@Getter
public class Fabric_Composition {

    private static final String FABRIC_COMPOSITION_PATTERN = "^[a-zA-Z0-9%\\/\\s]+$";

    private final String value;

    public Fabric_Composition(String composition) {
        if (composition == null || composition.isEmpty()) {
            throw new FabricException("Error: La composición de la tela no puede ser nulo o vacío.");
        }

        if (!RegexValidator.validateRegex(composition, FABRIC_COMPOSITION_PATTERN)) {
            throw new FabricException("Error: La composición de la tela no cumple con el formato requerido.");
        }

        this.value = composition;
    }
}
