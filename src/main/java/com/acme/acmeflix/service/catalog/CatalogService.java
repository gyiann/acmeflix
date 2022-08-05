package com.acme.acmeflix.service.catalog;

import com.acme.acmeflix.exception.BusinessException;
import com.acme.acmeflix.model.catalog.Catalog;
import com.acme.acmeflix.model.catalog.Country;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.service.BaseService;

public interface CatalogService extends BaseService<Catalog, Long> {
    boolean addMovie(Catalog catalog, Movie movie) throws BusinessException;
    boolean removeMovie(Catalog catalog, Movie movie) throws BusinessException;
    boolean addTvShow(Catalog catalog, TvShow tvShow) throws BusinessException;
    boolean removeTvShow(Catalog catalog, TvShow tvShow) throws BusinessException;
    Catalog getCatalog(Country country) throws BusinessException;
}
