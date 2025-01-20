package com.moviebooking.systemAdmin.multiplex;

import com.moviebooking.systemAdmin.city.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/multiplex")
public class MultiplexController {

    @Autowired
    private MultiplexService multiplexService;

    @PutMapping
    public Multiplex addMultiplex(@RequestBody Multiplex multiplex){
        System.out.println("Adding Multiplex : " + multiplex);
        System.out.println("Adding Multiplex : City : " + multiplex.getCity().getCityId());
        Multiplex addedMultiplex = multiplexService.addMultiplex(multiplex);
        return addedMultiplex;
    }

    @GetMapping(path = "/all")
    public List<Multiplex> getAllMultiplexes(@RequestParam int cityId) {
        System.out.println("Getting multiplexes for city : " + cityId);
        return multiplexService.getAllMultiplexes(cityId);
    }
}
