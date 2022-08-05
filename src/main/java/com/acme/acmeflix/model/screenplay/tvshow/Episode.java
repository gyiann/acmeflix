package com.acme.acmeflix.model.screenplay.tvshow;

import com.acme.acmeflix.model.BaseModel;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
}
