package com.acme.acmeflix.repository.account;

import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.model.account.Profile;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
import com.acme.acmeflix.repository.BaseRepository;

public interface AccountRepository extends BaseRepository<Account, Long> {
    Account findByEmail(String email);
    Profile findProfileByName(Account account, String profileName);
    Profile createProfile(Account account, String profileName);

    Profile removeProfile(Account account, Profile profile);

    void addToMyList(Profile profile, ScreenPlay screenPlay);

    void removeFromMyList(Profile profile, ScreenPlay screenPlay);
}
