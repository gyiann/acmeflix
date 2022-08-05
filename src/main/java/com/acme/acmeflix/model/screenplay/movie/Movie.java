package com.acme.acmeflix.model.screenplay.movie;

import com.acme.acmeflix.model.screenplay.ScreenPlay;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class Movie extends ScreenPlay {

}

