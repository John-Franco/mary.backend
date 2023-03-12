package com.mary.infrastructure.adapters.output.db.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "fabric_movements")
public class FabricMovementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "movement_type")
    private String movementType;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "comments")
    private String comments;

    @ManyToOne
    @JoinColumn(name = "fabric_id", referencedColumnName = "id")
    private FabricEntity fabric;

    public FabricMovementEntity(LocalDate date, String movementType, int quantity, String comments, FabricEntity fabric) {
        this.date = date;
        this.movementType = movementType;
        this.quantity = quantity;
        this.comments = comments;
        this.fabric = fabric;
    }

    public FabricMovementEntity(Long id, LocalDate date, String movementType, int quantity, String comments, FabricEntity fabric) {
        this.id = id;
        this.date = date;
        this.movementType = movementType;
        this.quantity = quantity;
        this.comments = comments;
        this.fabric = fabric;
    }
}
