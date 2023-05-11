package com.learn2code.vehicle.search.vehiclesearch.dao;

import com.learn2code.vehicle.search.vehiclesearch.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerDAO extends JpaRepository<Manufacturer, Integer> {
}
