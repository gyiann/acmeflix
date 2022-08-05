package com.acme.acmeflix.model.account;

import com.acme.acmeflix.model.BaseModel;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
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
public class Profile extends BaseModel {

    private String name;
    private Set<ScreenPlay> myList;
}
