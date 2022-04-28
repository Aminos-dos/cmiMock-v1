package com.example.cmimock.controllers;

import com.example.cmimock.models.GetFacturiersIn;
import com.example.cmimock.models.GetFacturiersOut;
import com.example.cmimock.services.FacturiersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturiersController {
    @Autowired
    FacturiersService facturiersService;
    @PostMapping("/getlistefacturiers")
    public GetFacturiersOut getListeFacturiers(@RequestBody GetFacturiersIn requestBody){
        return facturiersService.getListeFacturiers(requestBody);
    }
}
