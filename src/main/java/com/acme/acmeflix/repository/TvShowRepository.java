package com.acme.acmeflix.repository;

import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import org.springframework.stereotype.Repository;

@Repository
public interface TvShowRepository extends BaseRepository<TvShow, Long> {
}
