package com.example.ParcialIntegrador.Controller;

import com.example.ParcialIntegrador.Service.Integration.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PhoneLineController {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/pet")
    public int getCantCellphoneLines() {
        return integrationService.getCantCellphoneLines();
    }
}