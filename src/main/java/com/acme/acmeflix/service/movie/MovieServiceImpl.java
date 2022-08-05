package com.acme.acmeflix.service.movie;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.repository.BaseRepository;
import com.acme.acmeflix.repository.movie.MovieRepository;
import com.acme.acmeflix.service.BaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public BaseRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public Set<Movie> findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    @Override
    public Set<Movie> findByGenre(Genre genre) {
        return movieRepository.findByGenre(genre);
    }

}
