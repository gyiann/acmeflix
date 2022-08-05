package com.acme.acmeflix.model.catalog;

import com.acme.acmeflix.model.BaseModel;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class Catalog extends BaseModel {

    private Set<Movie> movies;
    private Set<TvShow> tvShows;
}
