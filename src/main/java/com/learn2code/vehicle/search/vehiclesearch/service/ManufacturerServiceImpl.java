package com.learn2code.vehicle.search.vehiclesearch.service;

import com.learn2code.vehicle.search.vehiclesearch.dao.ManufacturerDAO;
import com.learn2code.vehicle.search.vehiclesearch.entity.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

    @Autowired
    private ManufacturerDAO manufactuerDAO;

    @Override
    public Manufacturer saveManufactuer(Manufacturer manufacturer) {
        return manufactuerDAO.save(manufacturer);
    }
}
