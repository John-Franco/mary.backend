package com.mary.infrastructure.config;

import com.mary.application.ports.input.*;
import com.mary.application.ports.output.FabricMovementOutputPort;
import com.mary.application.ports.output.FabricOutputPort;
import com.mary.application.use_cases.GetFabric;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public GetAllFabricsInputPort getAllFabricsInputPort(FabricOutputPort fabricOutputPort) {
        return new GetAllFabricsInputPort(fabricOutputPort);
    }

    @Bean
    public SaveFabricInputPort saveFabricInputPort(FabricOutputPort fabricOutputPort) {
        return new SaveFabricInputPort(fabricOutputPort);
    }

    @Bean
    public GetAllFabricMovementsInputPort getAllFabricMovementsInputPort(FabricMovementOutputPort fabricMovementOutputPort) {
        return new GetAllFabricMovementsInputPort(fabricMovementOutputPort);
    }

    @Bean
    public SaveFabricMovementInputPort saveFabricMovementInputPort(FabricMovementOutputPort fabricMovementOutputPort, GetFabric getFabric) {
        return new SaveFabricMovementInputPort(fabricMovementOutputPort, getFabric);
    }

    @Bean
    public GetFabricInputPort getFabric(FabricOutputPort fabricOutputPort) {
        return new GetFabricInputPort(fabricOutputPort);
    }

    @Bean
    public GetFabricStockInputPort getFabricStockInputPort(FabricMovementOutputPort fabricMovementOutputPort) {
        return new GetFabricStockInputPort(fabricMovementOutputPort);
    }

}
