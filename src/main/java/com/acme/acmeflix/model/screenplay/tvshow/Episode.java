package com.acme.acmeflix.model.screenplay.tvshow;

import com.acme.acmeflix.model.BaseModel;
import com.acme.acmeflix.model.screenplay.Genre;
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
public class Episode extends BaseModel {

    private String title;
    private String description;
    private double duration;
    private Set<Genre> genre = new HashSet<>();
}
