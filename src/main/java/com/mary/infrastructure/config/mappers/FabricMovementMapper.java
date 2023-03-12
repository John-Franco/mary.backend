package com.mary.infrastructure.config.mappers;

import com.mary.domain.models.FabricMovement;
import com.mary.domain.value_objects.fabric_movement.*;
import com.mary.infrastructure.adapters.input.controllers.dtos.FabricMovementDto;
import com.mary.infrastructure.adapters.output.db.entities.FabricMovementEntity;

import java.util.List;

public class FabricMovementMapper {

    public static FabricMovement mapToDomain(FabricMovementEntity fabricMovementEntity) {
        return new FabricMovement(
                new FabricMovement_Id(fabricMovementEntity.getId()),
                new FabricMovement_Date(fabricMovementEntity.getDate()),
                FabricMovement_Type.fromName(fabricMovementEntity.getMovementType()),
                new FabricMovement_Quantity(fabricMovementEntity.getQuantity()),
                new FabricMovement_Comments(fabricMovementEntity.getComments()),
                FabricMapper.mapToDomain(fabricMovementEntity.getFabric())
        );
    }

    public static FabricMovement mapToDomain(FabricMovementDto fabricMovementDto) {
        return new FabricMovement(
                new FabricMovement_Date(fabricMovementDto.getDate()),
                FabricMovement_Type.fromName(fabricMovementDto.getMovementType()),
                new FabricMovement_Quantity(fabricMovementDto.getQuantity()),
                new FabricMovement_Comments(fabricMovementDto.getComments()),
                fabricMovementDto.getFabric() != null ? FabricMapper.mapToDomain(fabricMovementDto.getFabric()) : null
        );
    }

    public static FabricMovementEntity mapToEntity(FabricMovement fabricMovement) {
        if (fabricMovement.getId() != null) {
            return new FabricMovementEntity(
                    fabricMovement.getId().getValue(),
                    fabricMovement.getDate().getValue(),
                    fabricMovement.getMovementType().getName(),
                    fabricMovement.getQuantity().getValue(),
                    fabricMovement.getComments().getValue(),
                    FabricMapper.mapToEntity(fabricMovement.getFabric())
            );
        } else {
            return new FabricMovementEntity(
                    fabricMovement.getDate().getValue(),
                    fabricMovement.getMovementType().getName(),
                    fabricMovement.getQuantity().getValue(),
                    fabricMovement.getComments().getValue(),
                    FabricMapper.mapToEntity(fabricMovement.getFabric())
            );
        }
    }

    public static FabricMovementDto mapToDto(FabricMovement fabricMovement) {
        return new FabricMovementDto(
                fabricMovement.getId().getValue(),
                fabricMovement.getDate().getValue(),
                fabricMovement.getMovementType().getName(),
                fabricMovement.getQuantity().getValue(),
                fabricMovement.getComments().getValue(),
                FabricMapper.mapToDto(fabricMovement.getFabric())
        );
    }

    public static List<FabricMovement> mapToDomainList(List<FabricMovementEntity> fabricMovementEntities) {
        return fabricMovementEntities.stream().map(FabricMovementMapper::mapToDomain).toList();
    }

    public static List<FabricMovementEntity> mapToEntityList(List<FabricMovement> fabricMovements) {
        return fabricMovements.stream().map(FabricMovementMapper::mapToEntity).toList();
    }

    public static List<FabricMovementDto> mapToDtoList(List<FabricMovement> fabricMovements) {
        return fabricMovements.stream().map(FabricMovementMapper::mapToDto).toList();
    }

}
