package com.learn2code.vehicle.search.vehiclesearch.service;

import com.learn2code.vehicle.search.vehiclesearch.entity.Manufacturer;

import java.util.List;

public interface ManufacturerService {
    Manufacturer saveManufacturer(Manufacturer manufacturer);

    List<Manufacturer> getAllManufacturer();
}
