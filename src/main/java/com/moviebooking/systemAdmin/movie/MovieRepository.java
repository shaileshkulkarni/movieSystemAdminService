package com.moviebooking.systemAdmin.movie;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    public List<Movie> findByLanguage(Movie.Language language);
}
