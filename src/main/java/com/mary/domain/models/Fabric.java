package com.mary.domain.models;

import com.mary.domain.value_objects.fabric.*;
import lombok.Getter;

@Getter
public class Fabric {
    private Fabric_Id id;
    private Fabric_Name name;
    private Fabric_Composition composition;
    private Fabric_Width width;
    private Fabric_Length length;
    private Fabric_Color color;

    public Fabric(Fabric_Id id, Fabric_Name name, Fabric_Composition composition, Fabric_Width width, Fabric_Length length, Fabric_Color color) {
        this.id = id;
        this.name = name;
        this.composition = composition;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Fabric(Fabric_Name name, Fabric_Composition composition, Fabric_Width width, Fabric_Length length, Fabric_Color color) {
        this.name = name;
        this.composition = composition;
        this.width = width;
        this.length = length;
        this.color = color;
    }
}
