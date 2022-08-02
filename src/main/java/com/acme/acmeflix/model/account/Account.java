package com.acme.acmeflix.model.account;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Account {

    private String email;
    private String phoneNumber;
    private SubscriptionPlan subscriptionPlan;
    private Set<Profile> profiles;
}
