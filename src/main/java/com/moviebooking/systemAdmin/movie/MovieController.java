package com.moviebooking.systemAdmin.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PutMapping
    public Movie addMovie(@RequestBody Movie movie) {
        System.out.println("Adding Movie " + movie);
        return movieService.addMovie(movie);
    }

    @GetMapping("/all")
    public List<Movie> getAllMovies(){
        List<Movie> movies = new LinkedList<>();
        Iterable<Movie> itr = movieService.getAllMovies();
        while(itr.iterator().hasNext()){
            movies.add(itr.iterator().next());
        }
        return movies;
    }
}
