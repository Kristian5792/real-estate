package com.Kg.realestate.service;

import com.Kg.realestate.model.Floor;

import java.util.Set;

public interface FloorService  {

    Floor save(Floor floor);

    Floor findByNumber(Integer number);

    Floor findById(Long id);

    Floor update(Floor floor, Long id);

    void delete(Long id);

    Set<Floor> findAll();

}
