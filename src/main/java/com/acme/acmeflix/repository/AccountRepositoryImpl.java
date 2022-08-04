package com.acme.acmeflix.repository;

import com.acme.acmeflix.model.account.Account;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class AccountRepositoryImpl extends BaseRepositoryImpl<Account> implements AccountRepository {

    public AccountRepositoryImpl() {
        super(Account.class, new HashSet<>());
    }

}
