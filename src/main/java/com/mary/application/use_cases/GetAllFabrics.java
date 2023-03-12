package com.mary.application.use_cases;

import com.mary.domain.models.Fabric;

import java.util.List;

public interface GetAllFabrics {
    List<Fabric> execute();
}
