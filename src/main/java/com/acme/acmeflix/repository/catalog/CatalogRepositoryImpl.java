package com.acme.acmeflix.repository.catalog;

import com.acme.acmeflix.model.catalog.Catalog;
import com.acme.acmeflix.model.catalog.Country;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CatalogRepositoryImpl extends BaseRepositoryImpl<Catalog> implements CatalogRepository {

    private static final AtomicLong idCounter = new AtomicLong();
    private static final Map<Long, Catalog> catalogs = new LinkedHashMap<>();

    @Override
    public AtomicLong getIdCounter() {
        return idCounter;
    }

    @Override
    public Class<Catalog> getType() {
        return Catalog.class;
    }

    @Override
    public Map<Long, Catalog> getMap() {
        return catalogs;
    }

    @Override
    public Movie addMovie(Catalog catalog, Movie movie) {
        return catalogs.get(catalog.getId()).getMovies().add(movie) ? movie : null;
    }

    @Override
    public Movie removeMovie(Catalog catalog, Movie movie) {
        return catalogs.get(catalog.getId()).getMovies().remove(movie) ? movie : null;
    }

    @Override
    public TvShow addTvShow(Catalog catalog, TvShow tvShow) {
        return catalogs.get(catalog.getId()).getTvShows().add(tvShow) ? tvShow : null;
    }

    @Override
    public TvShow removeTvShow(Catalog catalog, TvShow tvShow) {
        return catalogs.get(catalog.getId()).getTvShows().add(tvShow) ? tvShow : null;
    }

    @Override
    public Catalog getCatalog(Country country) {
        return null;
    }
}
