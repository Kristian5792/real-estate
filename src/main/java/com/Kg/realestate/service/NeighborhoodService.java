package com.Kg.realestate.service;

import com.Kg.realestate.model.Neighborhood;

import java.util.Set;

public interface NeighborhoodService {

    Neighborhood findByName(String name);

    Neighborhood findById(Long id);

    Set<Neighborhood> findAll();

    Neighborhood save(Neighborhood neighborhood);
}
