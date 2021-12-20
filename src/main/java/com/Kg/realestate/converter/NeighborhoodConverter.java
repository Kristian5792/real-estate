package com.Kg.realestate.converter;


import com.Kg.realestate.dto.NeighborhoodDto;
import com.Kg.realestate.model.Neighborhood;
import org.springframework.stereotype.Component;

@Component
public class NeighborhoodConverter {

    public NeighborhoodDto toNeighborhoodDto(Neighborhood neighbourhood) {
        return NeighborhoodDto.builder()
                .id(neighbourhood.getId())
                .name(neighbourhood.getName())
                .build();
    }

    public Neighborhood toNeighborhood(NeighborhoodDto neighbourhoodDto) {
        return Neighborhood.builder()
                .id(neighbourhoodDto.getId())
                .name(neighbourhoodDto.getName())
                .build();
    }

}
