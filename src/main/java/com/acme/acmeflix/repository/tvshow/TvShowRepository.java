package com.acme.acmeflix.repository.tvshow;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TvShowRepository extends BaseRepository<TvShow, Long> {

    Set<TvShow> findByTitle(String title);
    Set<TvShow> findByGenre(Genre genre);
}
