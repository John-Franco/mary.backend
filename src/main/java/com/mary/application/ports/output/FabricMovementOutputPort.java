package com.mary.application.ports.output;

import com.mary.domain.models.FabricMovement;
import com.mary.domain.value_objects.fabric.Fabric_Id;

import java.util.List;

public interface FabricMovementOutputPort {
    List<FabricMovement> getAll();

    List<FabricMovement> getByFabricId(Fabric_Id fabricId);

    FabricMovement save(FabricMovement fabricMovement);
}
