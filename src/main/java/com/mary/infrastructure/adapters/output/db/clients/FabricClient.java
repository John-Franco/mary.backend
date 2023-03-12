package com.mary.infrastructure.adapters.output.db.clients;

import com.mary.application.ports.output.FabricOutputPort;
import com.mary.domain.models.Fabric;
import com.mary.infrastructure.adapters.output.db.repositories.FabricRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.mary.infrastructure.config.mappers.FabricMapper.*;

@Repository
@AllArgsConstructor
public class FabricClient implements FabricOutputPort {

    private final FabricRepository fabricRepository;

    @Override
    public Fabric getById(Long fabricId) {
        return mapToDomain(this.fabricRepository.findById(fabricId).orElse(null));
    }

    @Override
    public List<Fabric> getAll() {
        return mapToDomainList(this.fabricRepository.findAll());
    }

    @Override
    public Fabric save(Fabric fabric) {
        return mapToDomain(this.fabricRepository.save(mapToEntity(fabric)));
    }
}
