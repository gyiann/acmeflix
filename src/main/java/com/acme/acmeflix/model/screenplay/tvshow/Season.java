package com.acme.acmeflix.model.screenplay.tvshow;

import com.acme.acmeflix.model.BaseModel;
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
public class Season extends BaseModel {

    private int number;
    private Set<Episode> episodes;
}
