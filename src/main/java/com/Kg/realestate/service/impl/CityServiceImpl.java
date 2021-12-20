package com.Kg.realestate.service.impl;

import com.Kg.realestate.model.City;
import com.Kg.realestate.repository.CityRepository;
import com.Kg.realestate.service.CityService;
import com.Kg.realestate.service.NeighborhoodService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final NeighborhoodService neighborhoodService;


    public CityServiceImpl(CityRepository cityRepository,
                           NeighborhoodService neighborhoodService) {
        this.cityRepository = cityRepository;
        this.neighborhoodService = neighborhoodService;
    }

    @Override
    public City findById(Long id) {
        return null;
    }

    @Override
    public City save(City city) {
        return null;
    }

    @Override
    public Set<City> findAll() {
        return null;
    }
}
