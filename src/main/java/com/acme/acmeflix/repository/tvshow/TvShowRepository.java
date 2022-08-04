package com.acme.acmeflix.repository.tvshow;

import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvShowRepository extends BaseRepository<TvShow, Long> {
}
