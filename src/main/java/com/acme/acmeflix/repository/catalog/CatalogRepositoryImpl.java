package com.acme.acmeflix.repository.catalog;

import com.acme.acmeflix.exception.BusinessException;
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

    private static final AtomicLong idCounter = new AtomicLong(1);
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
    public boolean addMovie(Catalog catalog, Movie movie)  throws BusinessException {
        boolean movieAdded = catalogs.get(catalog.getId()).getMovies().add(movie);
        if (!movieAdded) {
            throw new BusinessException("Could not add movie.");
        }
        return true;
    }

    @Override
    public boolean removeMovie(Catalog catalog, Movie movie) throws BusinessException{
        boolean movieRemoved = catalogs.get(catalog.getId()).getMovies().remove(movie);
        if (!movieRemoved) {
            throw new BusinessException("Could not remove movie.");
        }
        return true;
    }

    @Override
    public boolean addTvShow(Catalog catalog, TvShow tvShow)  throws BusinessException{
        boolean tvShowAdded = catalogs.get(catalog.getId()).getTvShows().add(tvShow);
        if (!tvShowAdded) {
            throw new BusinessException("Could not add tv show.");
        }
        return true;
    }

    @Override
    public boolean removeTvShow(Catalog catalog, TvShow tvShow)  throws BusinessException{
        boolean tvShowAdded = catalogs.get(catalog.getId()).getTvShows().add(tvShow);
        if (!tvShowAdded) {
            throw new BusinessException("Could not add tv show.");
        }
        return true;
    }

    @Override
    public Catalog getCatalog(Country country) {
        return null;
    }

}
