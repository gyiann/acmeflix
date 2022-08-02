package com.acme.acmeflix.model.account;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public enum SubscriptionPlan {

    BASIC(new BigDecimal("7.99")),
    STANDARD(new BigDecimal("10.99")),
    PREMIUM(new BigDecimal("13.99"));

    private final BigDecimal price;
}
