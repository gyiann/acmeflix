package com.acme.acmeflix.model.screenplay.tvshow;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Season {

    private short number;
    private Set<Episode> episodes;
}
