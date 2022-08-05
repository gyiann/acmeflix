package com.acme.acmeflix.service.movie;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.service.BaseService;

import java.util.Set;

public interface MovieService extends BaseService<Movie, Long> {

    Set<Movie> findByTitle(String title);

    Set<Movie> findByGenre(Genre genre);

}
