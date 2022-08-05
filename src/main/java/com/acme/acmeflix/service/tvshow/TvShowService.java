package com.acme.acmeflix.service.tvshow;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.service.BaseService;

import java.util.Set;

public interface TvShowService extends BaseService<TvShow, Long> {

    Set<TvShow> findByTitle(String title);
    Set<TvShow> findByGenre(Genre genre);
}
