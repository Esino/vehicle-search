package com.learn2code.vehicle.search.vehiclesearch.service;

import com.learn2code.vehicle.search.vehiclesearch.dao.ManufacturerDAO;
import com.learn2code.vehicle.search.vehiclesearch.entity.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

    @Autowired
    private ManufacturerDAO manufacturerDAO;

    @Override
    public Manufacturer saveManufacturer(Manufacturer manufacturer) {
        return manufacturerDAO.save(manufacturer);
    }
    @Override
    public List<Manufacturer> getAllManufacturer(){
        return manufacturerDAO.findAll();
    }
}
