package com.Kg.realestate.controller;


import com.Kg.realestate.converter.CityConverter;
import com.Kg.realestate.dto.CityDto;
import com.Kg.realestate.model.City;
import com.Kg.realestate.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cities")
public class CityController {

    private final CityService cityService;
    private final CityConverter cityConverter;

    public CityController(CityService cityService, CityConverter cityConverter) {
        this.cityService = cityService;
        this.cityConverter = cityConverter;
    }

    @PostMapping
    public ResponseEntity<CityDto> save(@RequestBody CityDto cityDto) {
     City city = cityConverter.toCity(cityDto);
     City savedCity = cityService.save(city);
     CityDto cityDtoResponse = cityConverter.toCityDto(savedCity);
     return ResponseEntity.ok(cityDtoResponse);
    }

}
