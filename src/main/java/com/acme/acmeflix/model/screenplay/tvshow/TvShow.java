package com.acme.acmeflix.model.screenplay.tvshow;

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
public class TvShow implements ScreenPlay {

    private String title;
    private String description;
    private Set<Actor> cast;
    private Set<CrewMember> crewMembers;
    private Genre genre;
    private MaturityRating maturityRating;
    private Set<Season> seasons;
}
