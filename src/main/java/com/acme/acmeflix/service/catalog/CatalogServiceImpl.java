package com.acme.acmeflix.service.catalog;

import com.acme.acmeflix.exception.BusinessException;
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
    public boolean addMovie(Catalog catalog, Movie movie) throws BusinessException {
        return catalogRepository.addMovie(catalog, movie);
    }

    @Override
    public boolean removeMovie(Catalog catalog, Movie movie) throws BusinessException {
        return catalogRepository.removeMovie(catalog, movie);
    }

    @Override
    public boolean addTvShow(Catalog catalog, TvShow tvShow) throws BusinessException {
        return catalogRepository.addTvShow(catalog, tvShow);
    }

    @Override
    public boolean removeTvShow(Catalog catalog, TvShow tvShow) throws BusinessException {
        return catalogRepository.removeTvShow(catalog, tvShow);
    }

    @Override
    public Catalog getCatalog(Country country) {
        return null;
    }
}
