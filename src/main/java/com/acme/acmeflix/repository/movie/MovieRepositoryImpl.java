package com.acme.acmeflix.repository.movie;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.Rating;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class MovieRepositoryImpl extends BaseRepositoryImpl<Movie> implements MovieRepository {
    private static final AtomicLong idCounter = new AtomicLong(1);
    private static final Map<Long, Movie> movies = new LinkedHashMap<>();
    private static final Set<Rating> ratings = new LinkedHashSet<>();

    @Override
    public AtomicLong getIdCounter() {
        return idCounter;
    }

    @Override
    public Class<Movie> getType() {
        return Movie.class;
    }

    @Override
    public Map<Long, Movie> getMap() {
        return movies;
    }

    @Override
    public Set<Movie> findByTitle(String title) {
        return getMap().values().stream()
                .filter(movie -> movie.getTitle().equals(title))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Movie> findByGenre(Genre genre) {
        return getMap().values().stream()
                .filter(movie -> movie.getGenres().contains(genre))
                .collect(Collectors.toSet());
    }

    @Override
    public void addMovie(Movie movie) {
        movies.put(movie.getId(), movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        movies.remove(movie.getId());
    }
}
