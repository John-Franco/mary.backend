package com.mary.infrastructure.adapters.input.controllers;

import com.mary.application.use_cases.GetAllFabrics;
import com.mary.application.use_cases.SaveFabric;
import com.mary.infrastructure.adapters.input.controllers.dtos.FabricDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mary.infrastructure.config.mappers.FabricMapper.*;

@RestController
@AllArgsConstructor
@RequestMapping("/fabrics")
public class FabricController {

    private final GetAllFabrics getAllFabrics;

    private final SaveFabric saveFabric;

    @GetMapping
    public ResponseEntity<List<FabricDto>> getAllFabric() {
        return ResponseEntity.ok().body(mapToDtoList(this.getAllFabrics.execute()));
    }

    @PostMapping
    public ResponseEntity<FabricDto> saveFabric(
            @RequestBody FabricDto fabricDto
    ) {
        return ResponseEntity.ok().body(mapToDto(this.saveFabric.execute(mapToDomain(fabricDto))));
    }
}
