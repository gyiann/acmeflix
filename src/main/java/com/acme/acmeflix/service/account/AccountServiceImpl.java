package com.acme.acmeflix.service.account;

import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.model.account.Profile;
import com.acme.acmeflix.model.account.SubscriptionPlan;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
import com.acme.acmeflix.repository.BaseRepository;
import com.acme.acmeflix.repository.account.AccountRepository;
import com.acme.acmeflix.service.BaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public BaseRepository<Account, Long> getRepository() {
        return accountRepository;
    }

    @Override
    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    @Override
    public Account createNewAccount(String email) {
        if (findByEmail(email) != null) {
            return null;
        }
        return create(Account.builder()
                    .email(email)
                    .profiles(new HashSet<>())
                    .build());
    }

    @Override
    public void registerAccount(Account account, String phoneNumber, SubscriptionPlan subscriptionPlan) {
        Account updatedAccount = Account.builder()
                .id(account.getId())
                .email(account.getEmail())
                .phoneNumber(phoneNumber)
                .subscriptionPlan(subscriptionPlan)
                .profiles(account.getProfiles())
                .build();
        update(updatedAccount);
    }

    @Override
    public Profile findProfileByName(Account account, String profileName) {
        return accountRepository.findProfileByName(account, profileName);
    }

    @Override
    public Profile createProfile(Account account, String profileName) {
        if (findProfileByName(account, profileName) != null) {
            return null;
        }
        return accountRepository.createProfile(account, profileName);
    }

    @Override
    public Profile removeProfile(Account account, Profile profile) {
        return accountRepository.removeProfile(account, profile);
    }

    @Override
    public void addToMyList(Profile profile, ScreenPlay screenPlay) {
        accountRepository.addToMyList(profile, screenPlay);
    }

    @Override
    public void removeFromMyList(Profile profile, ScreenPlay screenPlay) {
        accountRepository.removeFromMyList(profile, screenPlay);
    }
}
