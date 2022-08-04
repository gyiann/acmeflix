package com.acme.acmeflix.model.screenplay.involved;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class CrewMember {

  private String firstName;
  private String lastName;
  private Role role;
}
