package com.moviebooking.systemAdmin.city;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @PutMapping
    public City addCity(@RequestBody City city){
        System.out.println("Adding New City : " + city);
        City newCity = cityService.addCity(city);
        return newCity;
    }

    @GetMapping(path = "/all")
    public List<City> getAllCities(){
        return cityService.getAllCities();
    }

    @GetMapping
    public City getCity(@RequestParam  String name){
        System.out.println("Get City : " + name);
        return  cityService.getCity(name);
    }
}
