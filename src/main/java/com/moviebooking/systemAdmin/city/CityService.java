package com.moviebooking.systemAdmin.city;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public City addCity(City city){
        // Validate city

        City newCity = cityRepository.saveAndFlush(city);

        System.out.println("City added : "+newCity);

        return newCity;
    }

    public City getCity(String name){
        return cityRepository.findByName(name);
    }

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }
}
