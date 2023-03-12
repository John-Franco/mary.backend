package com.mary.application.ports.output;

import com.mary.domain.models.Fabric;

import java.util.List;

public interface FabricOutputPort {

    Fabric getById(Long fabricId);

    List<Fabric> getAll();

    Fabric save(Fabric fabric);
}
