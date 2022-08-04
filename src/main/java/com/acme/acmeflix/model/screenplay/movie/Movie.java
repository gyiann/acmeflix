package com.acme.acmeflix.model.screenplay.movie;

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
@RequiredArgsConstructor
//@AllArgsConstructor
//@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class Movie extends BaseModel implements ScreenPlay {

    private String title;
    private String description;
    private Set<Actor> cast = new HashSet<>();
    private Set<CrewMember> crewMembers = new HashSet<>();
    private double duration;
    private Set<Genre> genre = new HashSet<>();
    private MaturityRating maturityRating;
}

