package com.mary.application.ports.input;

import com.mary.application.ports.output.FabricMovementOutputPort;
import com.mary.application.use_cases.GetAllFabricMovements;
import com.mary.domain.models.FabricMovement;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllFabricMovementsInputPort implements GetAllFabricMovements {
    private final FabricMovementOutputPort fabricMovementOutputPort;

    @Override
    public List<FabricMovement> execute() {
        return this.fabricMovementOutputPort.getAll();
    }
}
