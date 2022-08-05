package com.acme.acmeflix.model.screenplay;

import com.acme.acmeflix.model.BaseModel;
import com.acme.acmeflix.model.account.Profile;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class Rating extends BaseModel {

    private ScreenPlay screenPlay;
    private Profile profile;
    private Rating rating;
}
