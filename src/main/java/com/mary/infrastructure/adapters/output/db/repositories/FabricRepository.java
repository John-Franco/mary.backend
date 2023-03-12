package com.mary.infrastructure.adapters.output.db.repositories;


import com.mary.infrastructure.adapters.output.db.entities.FabricEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FabricRepository extends JpaRepository<FabricEntity, Long>, JpaSpecificationExecutor<FabricEntity> {

}
