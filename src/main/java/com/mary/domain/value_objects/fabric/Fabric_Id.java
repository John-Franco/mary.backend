package com.mary.domain.value_objects.fabric;

import com.mary.domain.exceptions.FabricException;
import lombok.Getter;

@Getter
public class Fabric_Id {
    private final Long value;

    public Fabric_Id(Long id) {
        if (id == null) {
            throw new FabricException("Error: El id de la tela no puede ser nulo o vacío.");
        }
        this.value = id;
    }
}
