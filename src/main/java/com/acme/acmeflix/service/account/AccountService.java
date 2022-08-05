package com.acme.acmeflix.service.account;

import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.model.account.Profile;
import com.acme.acmeflix.model.account.SubscriptionPlan;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
import com.acme.acmeflix.service.BaseService;

public interface AccountService extends BaseService<Account, Long> {
    Account findByEmail(String email);

    Account createNewAccount(String email);

    void registerAccount(Account account, String phoneNumber, SubscriptionPlan subscriptionPlan);

    Profile findProfileByName(Account account, String profileName);

    Profile createProfile(Account account, String profileName);

    Profile removeProfile(Account account, Profile profile);

    void addToMyList(Profile profile, ScreenPlay screenPlay);

    void removeFromMyList(Profile profile, ScreenPlay screenPlay);

}
