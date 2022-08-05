package com.acme.acmeflix.model.screenplay;

import com.acme.acmeflix.model.BaseModel;
import com.acme.acmeflix.model.screenplay.involved.CrewMember;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class ScreenPlay extends BaseModel {

    private String title;
    private String description;
    private Set<CrewMember> crewMembers;
    private Set<Genre> genres;
    private MaturityRating maturityRating;
    private Set<Language> audioLanguages;
    private Set<Language> subtitleLanguages;
}
