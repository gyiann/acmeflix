package com.acme.acmeflix.model.account;

import com.acme.acmeflix.model.screenplay.ScreenPlay;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Profile {

    private String name;
    private Set<ScreenPlay> myList;
}
