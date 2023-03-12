package com.mary.domain.models;

import com.mary.domain.value_objects.fabric_movement.*;
import lombok.Getter;

@Getter
public class FabricMovement {
    private FabricMovement_Id id;
    private FabricMovement_Date date;
    private FabricMovement_Type movementType;
    private FabricMovement_Quantity quantity;
    private FabricMovement_Comments comments;
    private Fabric fabric;

    public FabricMovement(FabricMovement_Id id, FabricMovement_Date date, FabricMovement_Type movementType, FabricMovement_Quantity quantity, FabricMovement_Comments comments, Fabric fabric) {
        this.id = id;
        this.date = date;
        this.movementType = movementType;
        this.quantity = quantity;
        this.comments = comments;
        this.fabric = fabric;
    }

    public FabricMovement(FabricMovement_Date date, FabricMovement_Type movementType, FabricMovement_Quantity quantity, FabricMovement_Comments comments, Fabric fabric) {
        this.date = date;
        this.movementType = movementType;
        this.quantity = quantity;
        this.comments = comments;
        this.fabric = fabric;
    }
}
