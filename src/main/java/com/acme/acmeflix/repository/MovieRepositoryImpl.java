package com.acme.acmeflix.repository;

import com.acme.acmeflix.model.screenplay.movie.Movie;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class MovieRepositoryImpl extends BaseRepositoryImpl<Movie> implements MovieRepository {

    public MovieRepositoryImpl() {
        super(Movie.class, new HashSet<>());
    }
}
