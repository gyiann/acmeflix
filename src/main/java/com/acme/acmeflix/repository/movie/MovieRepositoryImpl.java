package com.acme.acmeflix.repository.movie;

import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class MovieRepositoryImpl extends BaseRepositoryImpl<Movie> implements MovieRepository {

    public MovieRepositoryImpl() {
        super(Movie.class, new HashSet<>());
    }
}
