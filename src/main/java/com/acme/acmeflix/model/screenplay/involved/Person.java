package com.acme.acmeflix.model.screenplay.involved;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Person {

    private String firstName;
    private String lastName;
}
