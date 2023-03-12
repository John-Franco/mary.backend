package com.mary.application.use_cases;

import com.mary.domain.value_objects.fabric.Fabric_Id;

public interface GetFabricStock {
    int execute(Fabric_Id fabricId);
}
