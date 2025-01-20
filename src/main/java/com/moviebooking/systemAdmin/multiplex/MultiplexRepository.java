package com.moviebooking.systemAdmin.multiplex;

import com.moviebooking.systemAdmin.city.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MultiplexRepository extends CrudRepository<Multiplex, Integer> {

    public List<Multiplex> findByCity(City city);
}
