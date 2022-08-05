package com.acme.acmeflix.service.account;

import com.acme.acmeflix.exception.BusinessException;
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
import java.util.Set;

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
    public Account createNewAccount(String email)
            throws BusinessException {
        if (findByEmail(email) != null) {
            logger.info("An account with this {} already exists.", email);
            throw new BusinessException("An account with this " + email + " already exists.");
        }
        return create(Account.builder()
                .email(email)
                .profiles(new HashSet<>())
                .build());
    }

    @Override
    public Account registerAccount(Account account, String phoneNumber, SubscriptionPlan subscriptionPlan)
            throws BusinessException {
        Account updatedAccount = Account.builder()
                .id(account.getId())
                .email(account.getEmail())
                .phoneNumber(phoneNumber)
                .subscriptionPlan(subscriptionPlan)
                .profiles(account.getProfiles())
                .build();
        if (update(updatedAccount)) {
            return updatedAccount;
        } else {
            throw new BusinessException("Account registration failed.");
        }
    }

    @Override
    public Profile findProfileByName(Account account, String profileName) {
        return accountRepository.findProfileByName(account, profileName);
    }

    @Override
    public Profile createProfile(Account account, String profileName)
            throws BusinessException {
        if (findProfileByName(account, profileName) != null) {
            throw new BusinessException("Unable to create profile " + profileName + " already exists.");
        }
        return accountRepository.createProfile(account, profileName);
    }

    @Override
    public boolean removeProfile(Account account, Profile profile)
            throws BusinessException {
        if (accountRepository.removeProfile(account, profile)) {
            return true;
        } else {
            throw new BusinessException("Unable to remove profile " + profile.getName() + ".");
        }
    }

    @Override
    public Set<Profile> getProfiles(Account account) {

        return accountRepository.getProfiles(account);
    }

    @Override
    public boolean addToMyList(Profile profile, ScreenPlay screenPlay)
            throws BusinessException {
        if (accountRepository.addToMyList(profile, screenPlay)) {
            return true;
        } else {
            throw new BusinessException("Unable to add ScreenPlayn to profile.");
        }
    }

    @Override
    public boolean removeFromMyList(Profile profile, ScreenPlay screenPlay)
            throws BusinessException {
        if (accountRepository.removeFromMyList(profile, screenPlay)) {
            return true;
        } else {
            throw new BusinessException("Unable to add ScreenPlayn to profile.");
        }
    }

    @Override
    public Set<ScreenPlay> getMyList(Profile profile) {

        return accountRepository.getMyList(profile);
    }
}
