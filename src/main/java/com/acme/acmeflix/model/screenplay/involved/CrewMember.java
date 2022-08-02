package com.acme.acmeflix.model.screenplay.involved;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class CrewMember extends Person {

  private Role role;
}
