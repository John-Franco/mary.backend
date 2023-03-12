package com.mary.application.use_cases;

import com.mary.domain.models.Fabric;
import com.mary.domain.value_objects.fabric.Fabric_Id;

public interface GetFabric {

    Fabric execute(Fabric_Id fabricId);
}
