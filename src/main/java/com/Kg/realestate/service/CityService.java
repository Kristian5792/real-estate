package com.Kg.realestate.service;

import com.Kg.realestate.model.City;

import java.util.Set;

public interface CityService {
    City findById(Long id);

    City save(City city);

    Set<City> findAll();

}
