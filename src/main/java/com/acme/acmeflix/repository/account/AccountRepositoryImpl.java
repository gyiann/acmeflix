package com.acme.acmeflix.repository.account;

import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class AccountRepositoryImpl extends BaseRepositoryImpl<Account> implements AccountRepository {

    public AccountRepositoryImpl() {
        super(Account.class, new HashSet<>());
    }

}
