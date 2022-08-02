package com.acme.acmeflix.model.screenplay.movie;

import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.MaturityRating;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
import com.acme.acmeflix.model.screenplay.involved.Actor;
import com.acme.acmeflix.model.screenplay.involved.CrewMember;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Movie implements ScreenPlay {

    private String title;
    private String description;
    private Set<Actor> cast;
    private Set<CrewMember> crewMembers;
    private double duration;
    private Set<Genre> genre;
    private MaturityRating maturityRating;
}
