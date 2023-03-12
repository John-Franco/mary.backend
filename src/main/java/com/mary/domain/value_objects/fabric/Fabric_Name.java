package com.mary.domain.value_objects.fabric;

import com.mary.domain.exceptions.FabricException;
import com.mary.domain.value_objects.validators.RegexValidator;
import lombok.Getter;

@Getter
public class Fabric_Name {
    private static final String FABRIC_NAME_PATTERN = "^[a-zA-Z0-9 ]{3,50}$";

    private final String value;

    public Fabric_Name(String name) {
        if (name == null || name.isEmpty()) {
            throw new FabricException("Error: El nombre de la tela no puede ser nulo o vacío.");
        }

        if (!RegexValidator.validateRegex(name, FABRIC_NAME_PATTERN)) {
            throw new FabricException("Error: El nombre de la tela no cumple con el formato requerido.");
        }

        this.value = name;
    }
}
