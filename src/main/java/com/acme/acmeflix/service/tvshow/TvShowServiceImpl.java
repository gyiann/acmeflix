package com.acme.acmeflix.service.tvshow;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.BaseRepository;
import com.acme.acmeflix.repository.tvshow.TvShowRepository;
import com.acme.acmeflix.service.BaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends BaseServiceImpl<TvShow> implements TvShowService {

    private final TvShowRepository tvShowRepository;

    @Override
    public BaseRepository<TvShow, Long> getRepository() {
        return tvShowRepository;
    }

    @Override
    public Set<TvShow> findByTitle(String title) {
        return tvShowRepository.findByTitle(title);
    }

    @Override
    public Set<TvShow> findByGenre(Genre genre) {
        return tvShowRepository.findByGenre(genre);
    }
}
