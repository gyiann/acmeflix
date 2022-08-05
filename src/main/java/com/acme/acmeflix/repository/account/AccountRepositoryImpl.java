package com.acme.acmeflix.repository.account;

import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.model.account.Profile;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class AccountRepositoryImpl extends BaseRepositoryImpl<Account> implements AccountRepository {

    private static final AtomicLong idCounter = new AtomicLong(1);
    private static final Map<Long, Account> accounts = new LinkedHashMap<>();

    @Override
    public AtomicLong getIdCounter() {
        return idCounter;
    }

    @Override
    public Class<Account> getType() {
        return Account.class;
    }

    @Override
    public Map<Long, Account> getMap() {
        return accounts;
    }

    @Override
    public Account create(Account account) {
        if (account.getProfiles() == null) {
            account.setProfiles(new HashSet<>());
        }
        return super.create(account);
    }

    @Override
    public Account findByEmail(String email) {

        return findAll().stream()
                .filter(account -> account.getEmail().equals(email))
                .findAny()
                .orElse(null);
    }

    @Override
    public Profile findProfileByName(Account account, String profileName) {
        return account.getProfiles().stream()
                .filter(p -> p.getName().equals(profileName))
                .findAny()
                .orElse(null);
    }

    @Override
    public Profile createProfile(Account account, String profileName) {
        Profile profile = Profile.builder()
                .name(profileName)
                .myList(new HashSet<>())
                .build();

        account.getProfiles().add(profile);
        return profile;
    }

    @Override
    public boolean removeProfile(Account account, Profile profile) {

        return account.getProfiles().remove(profile);
    }

    @Override
    public Set<Profile> getProfiles(Account account) {

        return new HashSet<>(account.getProfiles());
    }

    @Override
    public boolean addToMyList(Profile profile, ScreenPlay screenPlay) {

        return profile.getMyList().add(screenPlay);
    }

    @Override
    public boolean removeFromMyList(Profile profile, ScreenPlay screenPlay) {

        return profile.getMyList().remove(screenPlay);
    }

    @Override
    public Set<ScreenPlay> getMyList(Profile profile) {

        return new HashSet<>(profile.getMyList());
    }
}
