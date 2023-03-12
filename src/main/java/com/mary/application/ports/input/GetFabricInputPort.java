package com.mary.application.ports.input;

import com.mary.application.ports.output.FabricOutputPort;
import com.mary.application.use_cases.GetFabric;
import com.mary.domain.models.Fabric;
import com.mary.domain.value_objects.fabric.Fabric_Id;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetFabricInputPort implements GetFabric {

    private final FabricOutputPort fabricOutputPort;

    @Override
    public Fabric execute(Fabric_Id fabricId) {
        return this.fabricOutputPort.getById(fabricId.getValue());
    }
}
