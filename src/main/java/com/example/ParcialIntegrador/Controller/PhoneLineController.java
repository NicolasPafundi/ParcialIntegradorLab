package com.example.ParcialIntegrador.Controller;

import com.example.ParcialIntegrador.Service.Integration.IntegrationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PhoneLineController {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/PhoneLine")
    @ApiOperation(value="obtener la cantidad lineas telefonicas moviles")
    @ApiResponses(value={@ApiResponse(code=200,message = "ejecucion exitosa"), @ApiResponse(code = 500, message = "error interno")})
    public ResponseEntity<Integer> getCantCellphoneLines() {
        try{
            return ResponseEntity.ok(integrationService.getCantCellphoneLines());
        }catch (Exception ex){
            throw ex;
        }

    }
}