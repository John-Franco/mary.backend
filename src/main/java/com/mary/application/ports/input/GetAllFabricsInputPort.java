package com.mary.application.ports.input;

import com.mary.application.ports.output.FabricOutputPort;
import com.mary.application.use_cases.GetAllFabrics;
import com.mary.domain.models.Fabric;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllFabricsInputPort implements GetAllFabrics {

    private final FabricOutputPort fabricOutputPort;

    @Override
    public List<Fabric> execute() {
        return this.fabricOutputPort.getAll();
    }
}
