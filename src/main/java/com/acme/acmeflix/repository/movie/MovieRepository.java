package com.acme.acmeflix.repository.movie;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.repository.BaseRepository;

import java.util.Set;

public interface MovieRepository extends BaseRepository<Movie, Long> {

    Set<Movie> findByTitle(String title);

    Set<Movie> findByGenre(Genre genre);

    void addMovie(Movie movie);

    void removeMovie(Movie movie);
}
