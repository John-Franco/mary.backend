package com.mary.infrastructure.config.mappers;

import com.mary.domain.models.Fabric;
import com.mary.domain.value_objects.fabric.*;
import com.mary.infrastructure.adapters.input.controllers.dtos.FabricDto;
import com.mary.infrastructure.adapters.output.db.entities.FabricEntity;

import java.util.List;

public class FabricMapper {

    private FabricMapper() {
    }

    public static Fabric mapToDomain(FabricEntity fabricEntity) {
        if (fabricEntity == null) {
            return null;
        }

        return new Fabric(
                new Fabric_Id(fabricEntity.getId()),
                new Fabric_Name(fabricEntity.getName()),
                new Fabric_Composition(fabricEntity.getComposition()),
                new Fabric_Width(fabricEntity.getWidth()),
                new Fabric_Length(fabricEntity.getLength()),
                new Fabric_Color(fabricEntity.getColor())
        );
    }

    public static Fabric mapToDomain(FabricDto fabricDto) {
        if (fabricDto.getId() != null) {
            return new Fabric(
                    new Fabric_Id(fabricDto.getId()),
                    new Fabric_Name(fabricDto.getName()),
                    new Fabric_Composition(fabricDto.getComposition()),
                    new Fabric_Width(fabricDto.getWidth()),
                    new Fabric_Length(fabricDto.getLength()),
                    new Fabric_Color(fabricDto.getColor())
            );
        } else {
            return new Fabric(
                    new Fabric_Name(fabricDto.getName()),
                    new Fabric_Composition(fabricDto.getComposition()),
                    new Fabric_Width(fabricDto.getWidth()),
                    new Fabric_Length(fabricDto.getLength()),
                    new Fabric_Color(fabricDto.getColor())
            );
        }
    }

    public static FabricDto mapToDto(Fabric fabric) {
        return new FabricDto(
                fabric.getId().getValue(),
                fabric.getName().getValue(),
                fabric.getComposition().getValue(),
                fabric.getWidth().getValue(),
                fabric.getLength().getValue(),
                fabric.getColor().getValue()
        );
    }

    public static FabricEntity mapToEntity(Fabric fabric) {
        if (fabric.getId() != null) {
            return new FabricEntity(
                    fabric.getId().getValue(),
                    fabric.getName().getValue(),
                    fabric.getComposition().getValue(),
                    fabric.getWidth().getValue(),
                    fabric.getLength().getValue(),
                    fabric.getColor().getValue()
            );
        } else {
            return new FabricEntity(
                    fabric.getName().getValue(),
                    fabric.getComposition().getValue(),
                    fabric.getWidth().getValue(),
                    fabric.getLength().getValue(),
                    fabric.getColor().getValue()
            );
        }
    }

    public static List<Fabric> mapToDomainList(List<FabricEntity> fabricEntities) {
        return fabricEntities.stream().map(FabricMapper::mapToDomain).toList();
    }

    public static List<FabricDto> mapToDtoList(List<Fabric> fabrics) {
        return fabrics.stream().map(FabricMapper::mapToDto).toList();
    }

}
