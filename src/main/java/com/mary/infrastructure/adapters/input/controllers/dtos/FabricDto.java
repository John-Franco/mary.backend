package com.mary.infrastructure.adapters.input.controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FabricDto {
    private Long id;
    private String name;
    private String composition;
    private int width;
    private int length;
    private String color;
}
