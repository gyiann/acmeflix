package com.acme.acmeflix.model.screenplay.tvshow;

import com.acme.acmeflix.model.screenplay.Genre;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Episode {

    private String title;
    private String description;
    private double duration;
    private Set<Genre> genre;
}
