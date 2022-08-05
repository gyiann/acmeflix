package com.acme.acmeflix.repository.tvshow;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class TvShowRepositoryImpl extends BaseRepositoryImpl<TvShow> implements TvShowRepository {
    private static final AtomicLong idCounter = new AtomicLong(1);
    private static final Map<Long, TvShow> tvShows = new LinkedHashMap<>();

    @Override
    public AtomicLong getIdCounter() {
        return idCounter;
    }

    @Override
    public Class<TvShow> getType() {
        return TvShow.class;
    }

    @Override
    public Map<Long, TvShow> getMap() {
        return tvShows;
    }


    @Override
    public Set<TvShow> findByTitle(String title) {
        return tvShows.values().stream()
                .filter(tvShow -> tvShow.getTitle().equals(title))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<TvShow> findByGenre(Genre genre) {
        return tvShows.values().stream()
                .filter(tvShow -> tvShow.getGenres().contains(genre))
                .collect(Collectors.toSet());
    }
}
