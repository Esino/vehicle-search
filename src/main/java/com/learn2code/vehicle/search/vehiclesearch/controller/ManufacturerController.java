package com.learn2code.vehicle.search.vehiclesearch.controller;

import com.learn2code.vehicle.search.vehiclesearch.entity.Manufacturer;
import com.learn2code.vehicle.search.vehiclesearch.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;


    @PostMapping
    public ResponseEntity<Manufacturer> createManufacturer(@RequestBody Manufacturer manufacturer){
        Manufacturer dbRecord = manufacturerService.saveManufactuer(manufacturer);
        return new ResponseEntity<>(dbRecord, HttpStatus.CREATED);
    }
}
