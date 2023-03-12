package com.mary.infrastructure.adapters.output.db.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "fabric")
public class FabricEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "composition")
    private String composition;

    @Column(name = "width")
    private int width;

    @Column(name = "length")
    private int length;

    @Column(name = "color")
    private String color;

    public FabricEntity(Long id, String name, String composition, int width, int length, String color) {
        this.id = id;
        this.name = name;
        this.composition = composition;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public FabricEntity(String name, String composition, int width, int length, String color) {
        this.name = name;
        this.composition = composition;
        this.width = width;
        this.length = length;
        this.color = color;
    }
}
