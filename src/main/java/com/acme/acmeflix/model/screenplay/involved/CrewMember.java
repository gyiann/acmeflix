package com.acme.acmeflix.model.screenplay.involved;

import com.acme.acmeflix.model.BaseModel;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class CrewMember extends BaseModel {

    private String firstName;
    private String lastName;
    private Role role;
}
