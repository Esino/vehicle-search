package com.learn2code.vehicle.search.vehiclesearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="manufacturer_name")
    private String manufacturerName;

    @Column(name="country_of_origin")
    private String countryOfOrigin;
}
