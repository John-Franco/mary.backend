package com.mary.application.use_cases;

import com.mary.domain.models.FabricMovement;

import java.util.List;

public interface GetAllFabricMovements {
    List<FabricMovement> execute();
}
