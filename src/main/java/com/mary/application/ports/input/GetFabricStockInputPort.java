package com.mary.application.ports.input;

import com.mary.application.ports.output.FabricMovementOutputPort;
import com.mary.application.use_cases.GetFabricStock;
import com.mary.domain.models.FabricMovement;
import com.mary.domain.value_objects.fabric.Fabric_Id;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetFabricStockInputPort implements GetFabricStock {

    private final FabricMovementOutputPort fabricMovementOutputPort;

    @Override
    public int execute(Fabric_Id fabricId) {

        int totalQuantity = 0;

        List<FabricMovement> fabricMovements = this.fabricMovementOutputPort.getByFabricId(fabricId);

        if (fabricMovements.isEmpty()) {
            return 0;
        }

        for (FabricMovement currentMovement : fabricMovements) {

            switch (currentMovement.getMovementType()) {
                case INCOMING:
                    totalQuantity += currentMovement.getQuantity().getValue();
                    break;
                case OUTGOING:
                    totalQuantity -= currentMovement.getQuantity().getValue();
                    break;
                default:
                    break;
            }
        }

        return totalQuantity;
    }
}
