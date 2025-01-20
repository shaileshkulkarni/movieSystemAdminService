package com.moviebooking.systemAdmin.movie;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Movie addMovie(Movie movie) {

        return movieRepository.save(movie);
    }

    public Iterable<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
}
