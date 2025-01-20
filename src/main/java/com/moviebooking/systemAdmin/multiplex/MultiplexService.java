package com.moviebooking.systemAdmin.multiplex;

import com.moviebooking.systemAdmin.city.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultiplexService {

    @Autowired
    private MultiplexRepository multiplexRepository;


    public Multiplex addMultiplex(Multiplex multiplex){
        Multiplex addedMultiplex = multiplexRepository.save(multiplex);
        return addedMultiplex;
    }

    public List<Multiplex> getAllMultiplexes(int cityId){
        City city = new City();
        city.setCityId(cityId);
        return multiplexRepository.findByCity(city);
    }
}
