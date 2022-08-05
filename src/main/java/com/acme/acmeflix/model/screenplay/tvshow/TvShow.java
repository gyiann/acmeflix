package com.acme.acmeflix.model.screenplay.tvshow;

import com.acme.acmeflix.model.screenplay.ScreenPlay;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class TvShow extends ScreenPlay {

    private Set<Season> seasons = new HashSet<>();
}
