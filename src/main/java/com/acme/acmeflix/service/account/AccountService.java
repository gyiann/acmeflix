package com.acme.acmeflix.service.account;

import com.acme.acmeflix.exception.BusinessException;
import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.model.account.Profile;
import com.acme.acmeflix.model.account.SubscriptionPlan;
import com.acme.acmeflix.model.screenplay.ScreenPlay;
import com.acme.acmeflix.service.BaseService;

import java.util.Set;

public interface AccountService extends BaseService<Account, Long> {
    Account findByEmail(String email);

    Account createNewAccount(String email) throws BusinessException;

    Account registerAccount(Account account, String phoneNumber, SubscriptionPlan subscriptionPlan) throws BusinessException;

    Profile findProfileByName(Account account, String profileName);

    Profile createProfile(Account account, String profileName) throws BusinessException;

    boolean removeProfile(Account account, Profile profile) throws BusinessException;

    Set<Profile> getProfiles(Account account);

    boolean addToMyList(Profile profile, ScreenPlay screenPlay) throws BusinessException;

    boolean removeFromMyList(Profile profile, ScreenPlay screenPlay) throws BusinessException;

    Set<ScreenPlay> getMyList(Profile profile);
}
