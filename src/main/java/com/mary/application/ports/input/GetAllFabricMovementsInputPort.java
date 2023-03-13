package com.mary.application.ports.input;

import com.mary.application.ports.output.FabricMovementOutputPort;
import com.mary.application.use_cases.GetAllFabricMovements;
import com.mary.domain.models.FabricMovement;
import com.mary.domain.value_objects.fabric.Fabric_Id;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllFabricMovementsInputPort implements GetAllFabricMovements {
    private final FabricMovementOutputPort fabricMovementOutputPort;

    @Override
    public List<FabricMovement> execute(Fabric_Id fabricId) {
        return this.fabricMovementOutputPort.getByFabricId(fabricId);
    }
}
