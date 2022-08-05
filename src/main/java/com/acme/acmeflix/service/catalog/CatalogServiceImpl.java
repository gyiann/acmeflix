package com.acme.acmeflix.service.catalog;

import com.acme.acmeflix.model.catalog.Catalog;
import com.acme.acmeflix.model.catalog.Country;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.BaseRepository;
import com.acme.acmeflix.repository.catalog.CatalogRepository;
import com.acme.acmeflix.service.BaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl extends BaseServiceImpl<Catalog> implements CatalogService {

    private final CatalogRepository catalogRepository;

    @Override
    public BaseRepository<Catalog, Long> getRepository() {
        return catalogRepository;
    }

    @Override
    public Movie addMovie(Catalog catalog, Movie movie) {
        return catalogRepository.addMovie(catalog, movie);
    }

    @Override
    public Movie removeMovie(Catalog catalog, Movie movie) {
        return catalogRepository.removeMovie(catalog, movie);
    }

    @Override
    public TvShow addTvShow(Catalog catalog, TvShow tvShow) {
        return catalogRepository.addTvShow(catalog, tvShow);
    }

    @Override
    public TvShow removeTvShow(Catalog catalog, TvShow tvShow) {
        return catalogRepository.removeTvShow(catalog, tvShow);
    }

    @Override
    public Catalog getCatalog(Country country) {
        return null;
    }
}
