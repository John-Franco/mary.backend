package com.mary.infrastructure.adapters.output.db.repositories;

import com.mary.infrastructure.adapters.output.db.entities.FabricMovementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface FabricMovementRepository extends JpaRepository<FabricMovementEntity, Long>, JpaSpecificationExecutor<FabricMovementEntity> {

    List<FabricMovementEntity> findByFabricId(Long fabricId);
}
