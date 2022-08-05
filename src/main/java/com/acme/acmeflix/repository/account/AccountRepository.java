package com.acme.acmeflix.repository.account;

import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.model.account.Profile;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
import com.acme.acmeflix.repository.BaseRepository;

import java.util.Set;

public interface AccountRepository extends BaseRepository<Account, Long> {
    Account findByEmail(String email);

    Profile findProfileByName(Account account, String profileName);

    Profile createProfile(Account account, String profileName);

    boolean removeProfile(Account account, Profile profile);

    Set<Profile> getProfiles(Account account);

    boolean addToMyList(Profile profile, ScreenPlay screenPlay);

    boolean removeFromMyList(Profile profile, ScreenPlay screenPlay);

    Set<ScreenPlay> getMyList(Profile profile);
}
