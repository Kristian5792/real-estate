package com.Kg.realestate.converter;


import com.Kg.realestate.dto.CityDto;
import com.Kg.realestate.model.City;
import com.Kg.realestate.model.Neighborhood;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CityConverter {
    public CityDto toCityDto(City city) {
        return CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .neighborhoodIds(city.getNeighbourhoods()
                        .stream()
                        .map(Neighborhood::getId)
                        .collect(Collectors.toSet()))
                .build();
    }
    public City toCity(CityDto cityDto) {
        return City.builder()
                .id(cityDto.getId())
                .name(cityDto.getName())
                .neighbourhoods(cityDto.getNeighborhoodIds()
                        .stream()
                        .map((neighbourhoodId) ->
                                Neighborhood.builder().id(neighbourhoodId).build())
                        .collect(Collectors.toSet()))
                .build();
    }

}
