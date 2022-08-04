package com.acme.acmeflix.model.screenplay.tvshow;

import com.acme.acmeflix.model.BaseModel;
import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.MaturityRating;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
import com.acme.acmeflix.model.screenplay.involved.Actor;
import com.acme.acmeflix.model.screenplay.involved.CrewMember;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class TvShow extends BaseModel implements ScreenPlay {

    private String title;
    private String description;
    private Set<Actor> cast = new HashSet<>();
    private Set<CrewMember> crewMembers = new HashSet<>();
    private Set<Genre> genres = new HashSet<>();
    private MaturityRating maturityRating;
    private Set<Season> seasons = new HashSet<>();

}
