package com.mary.infrastructure.adapters.input.controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FabricMovementDto {
    private Long id;
    private LocalDate date;
    private String movementType;
    private int quantity;
    private String comments;
    private FabricDto fabric;
}
