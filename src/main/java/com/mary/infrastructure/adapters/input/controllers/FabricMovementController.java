package com.mary.infrastructure.adapters.input.controllers;

import com.mary.application.use_cases.GetAllFabricMovements;
import com.mary.application.use_cases.GetFabricStock;
import com.mary.application.use_cases.SaveFabricMovement;
import com.mary.domain.value_objects.fabric.Fabric_Id;
import com.mary.infrastructure.adapters.input.controllers.dtos.FabricMovementDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mary.infrastructure.config.mappers.FabricMovementMapper.*;

@RestController
@AllArgsConstructor
@RequestMapping("/fabric")
public class FabricMovementController {
    private final GetAllFabricMovements getAllFabricMovements;

    private final GetFabricStock getFabricStock;

    private final SaveFabricMovement saveFabricMovement;

    @GetMapping("/{fabricId}/movements")
    public ResponseEntity<List<FabricMovementDto>> getAllFabricMovements(@PathVariable Long fabricId) {
        return ResponseEntity.ok(mapToDtoList(this.getAllFabricMovements.execute(new Fabric_Id(fabricId))));
    }

    @GetMapping("/{fabricId}/movements/stock")
    public ResponseEntity<Integer> getFabricStock(@PathVariable Long fabricId) {
        return ResponseEntity.ok(this.getFabricStock.execute(new Fabric_Id(fabricId)));
    }

    @PostMapping("/{fabricId}/movements")
    public ResponseEntity<FabricMovementDto> saveFabricMovement(
            @PathVariable Long fabricId,
            @RequestBody FabricMovementDto fabricMovementDto
    ) {
        return ResponseEntity.ok(
                mapToDto(this.saveFabricMovement.execute(new Fabric_Id(fabricId), mapToDomain(fabricMovementDto)))
        );
    }


}
