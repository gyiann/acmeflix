package com.acme.acmeflix.model.catalog;

import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Catalog {

    private Country country;
    private Set<Movie> movies;
    private Set<TvShow> tvShows;
}
