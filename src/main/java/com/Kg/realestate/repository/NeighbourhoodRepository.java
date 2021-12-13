package com.Kg.realestate.repository;

import com.Kg.realestate.model.Neighbourhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NeighbourhoodRepository extends JpaRepository<Neighbourhood, Long> {
    Optional<Neighbourhood> findByName(String name);
}
