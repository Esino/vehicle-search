package com.learn2code.vehicle.search.vehiclesearch.dao;

import com.learn2code.vehicle.search.vehiclesearch.entity.ManufacturerYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerYearDAO extends JpaRepository<ManufacturerYear, Integer> {
}
