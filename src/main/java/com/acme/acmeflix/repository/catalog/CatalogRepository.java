package com.acme.acmeflix.repository.catalog;

import com.acme.acmeflix.model.catalog.Catalog;
import com.acme.acmeflix.model.catalog.Country;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.BaseRepository;

public interface CatalogRepository extends BaseRepository<Catalog, Long> {
    Movie addMovie(Catalog catalog, Movie movie);

    Movie removeMovie(Catalog catalog, Movie movie);

    TvShow addTvShow(Catalog catalog, TvShow tvShow);

    TvShow removeTvShow(Catalog catalog, TvShow tvShow);

    Catalog getCatalog(Country country);
}
