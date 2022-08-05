package com.acme.acmeflix.model.account;

import com.acme.acmeflix.model.BaseModel;
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
public class Account extends BaseModel {

    private String email;
    private String phoneNumber;
    private SubscriptionPlan subscriptionPlan;
    private Set<Profile> profiles;
}
