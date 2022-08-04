package com.acme.acmeflix.repository;

import com.acme.acmeflix.base.BaseComponent;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.util.Util;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class MovieRepository extends BaseComponent implements BaseRepository<Movie> {

    public static Set<Movie> movies = new HashSet<>();

    @Override
    public Movie create(Movie movie) {

        return Util.addModelToCollection(movie,movies);

    }

    @Override
    public List<Movie> createAll(Movie... movies) {

        return Arrays.stream(movies)
                .map(this::create)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    @Override
    public List<Movie> createAll(List<Movie> movies) {

        return movies.stream()
                .map(this::create)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    @Override
    public void update(Movie movie) {
    }

    @Override
    public void delete(Movie movie) {

        if (!movies.remove(movie)){
            logger.info("The movie you tried to delete does not exist.");
        }
    }

    @Override
    public boolean exists(Movie movie) {
        return movies.contains(movie);
    }

    @Override
    public Movie get(Long id) {

        return movies.stream()
                .filter(movie -> Objects.equals(movie.getId(), id))
                .findAny()
                .orElseThrow();
    }

    @Override
    public List<Movie> findAll() {
        return new ArrayList<>(movies);
    }

}
