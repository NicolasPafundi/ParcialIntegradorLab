package com.example.ParcialIntegrador.Service.Integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public int getCantCellphoneLines() {
        return integrationComponent.getCantCellphoneLines();
    }
}

