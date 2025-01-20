package com.moviebooking.systemAdmin.city;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {

    public City findByName(String name);
}
