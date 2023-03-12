package com.mary.application.ports.input;

import com.mary.application.exceptions.FabricNotFoundException;
import com.mary.application.ports.output.FabricMovementOutputPort;
import com.mary.application.use_cases.GetFabric;
import com.mary.application.use_cases.SaveFabricMovement;
import com.mary.domain.models.Fabric;
import com.mary.domain.models.FabricMovement;
import com.mary.domain.value_objects.fabric.Fabric_Id;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveFabricMovementInputPort implements SaveFabricMovement {

    private final FabricMovementOutputPort fabricMovementOutputPort;

    private final GetFabric getFabric;

    @Override
    public FabricMovement execute(Fabric_Id fabricId, FabricMovement fabricMovement) {
        Fabric fabric = this.getFabric.execute(fabricId);

        if (fabric == null) {
            throw new FabricNotFoundException(fabricId.getValue());
        }

        return this.fabricMovementOutputPort.save(new FabricMovement(
                fabricMovement.getDate(),
                fabricMovement.getMovementType(),
                fabricMovement.getQuantity(),
                fabricMovement.getComments(),
                fabric
        ));
    }
}
