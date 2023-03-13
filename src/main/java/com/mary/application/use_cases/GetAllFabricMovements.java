package com.mary.application.use_cases;

import com.mary.domain.models.FabricMovement;
import com.mary.domain.value_objects.fabric.Fabric_Id;

import java.util.List;

public interface GetAllFabricMovements {
    List<FabricMovement> execute(Fabric_Id fabricId);
}
