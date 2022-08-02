package com.acme.acmeflix.model.screenplay;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Rating {

    STAR_1((byte) 1),
    STAR_2((byte) 2),
    STAR_3((byte) 3),
    STAR_4((byte) 4),
    STAR_5((byte) 5);

    private final byte ratingValue;
}
