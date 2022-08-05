package com.acme.acmeflix.model.screenplay;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MaturityRating {

    G(0),
    PG(7),
    PG_13(13),
    R(16),
    NC_17(17),
    NOT_RATED(15);

    private final int minimumAllowedAge;

    public int getMinimumAllowedAge() {
        return minimumAllowedAge;
    }

}
