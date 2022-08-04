package com.acme.acmeflix.repository;

import com.acme.acmeflix.model.screenplay.tvshow.Episode;
import com.acme.acmeflix.model.screenplay.tvshow.Season;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.util.Util;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class TvShowRepository implements BaseRepository<TvShow> {

    Set<TvShow> tvShows = new HashSet<>();
    Set<Season> seasons = new HashSet<>();
    Set<Episode> episodes = new HashSet<>();

    @Override
    public TvShow create(TvShow tvShow) {

        createSeasons(tvShow.getSeasons());
        return Util.addModelToCollection(tvShow, tvShows);
    }

    @Override
    public List<TvShow> createAll(TvShow... tvShows) {
        return null;
    }

    @Override
    public List<TvShow> createAll(List<TvShow> tvShows) {
        return null;
    }

    @Override
    public void update(TvShow tvShow) {

    }

    @Override
    public void delete(TvShow tvShow) {

    }

    @Override
    public boolean exists(TvShow tvShow) {
        return false;
    }

    @Override
    public TvShow get(Long id) {
        return null;
    }

    @Override
    public List<TvShow> findAll() {
        return null;
    }


    private Set<Season> createSeasons(Set<Season> seasons) {

        return seasons.stream()
                .map(this::createSeason)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }

    private Season createSeason(Season season) {

        createEpisodes(season.getEpisodes());
        return Util.addModelToCollection(season, seasons);
    }

    private Set<Episode> createEpisodes(Set<Episode> episodes) {

        return episodes.stream()
                .map(this::createEpisode)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }

    private Episode createEpisode(Episode episode) {

        return Util.addModelToCollection(episode, episodes);
    }
}
