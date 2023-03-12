package com.mary.infrastructure.adapters.output.db.clients;

import com.mary.application.ports.output.FabricMovementOutputPort;
import com.mary.domain.models.FabricMovement;
import com.mary.domain.value_objects.fabric.Fabric_Id;
import com.mary.infrastructure.adapters.output.db.repositories.FabricMovementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.mary.infrastructure.config.mappers.FabricMovementMapper.*;

@Repository
@AllArgsConstructor
public class FabricMovementClient implements FabricMovementOutputPort {

    private final FabricMovementRepository fabricMovementRepository;

    @Override
    public List<FabricMovement> getAll() {
        return mapToDomainList(this.fabricMovementRepository.findAll());
    }

    @Override
    public List<FabricMovement> getByFabricId(Fabric_Id fabricId) {
        return mapToDomainList(this.fabricMovementRepository.findByFabricId(fabricId.getValue()));
    }

    @Override
    public FabricMovement save(FabricMovement fabricMovement) {
        return mapToDomain(this.fabricMovementRepository.save(mapToEntity(fabricMovement)));
    }
}
