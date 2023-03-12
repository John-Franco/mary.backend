package com.mary.application.ports.input;

import com.mary.application.ports.output.FabricOutputPort;
import com.mary.application.use_cases.SaveFabric;
import com.mary.domain.models.Fabric;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveFabricInputPort implements SaveFabric {

    private final FabricOutputPort fabricOutputPort;

    @Override
    public Fabric execute(Fabric fabric) {
        return this.fabricOutputPort.save(fabric);
    }
}
