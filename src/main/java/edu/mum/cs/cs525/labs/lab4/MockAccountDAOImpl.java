package edu.mum.cs.cs525.labs.lab4;

import java.util.ArrayList;
import java.util.Collection;

public class MockAccountDAOImpl implements AccountDAO {
    Collection<Account> accountlist = new ArrayList<Account>();

    @Override
    public void saveAccount(Account account) {
        accountlist.add(account); // add the new
    }

    @Override
    public void updateAccount(Account account) {
        Account accountexist = loadAccount(account.getAccountNumber());
        if (accountexist != null) {
            accountlist.remove(accountexist); // remove the old
            accountlist.add(account); // add the new
        }
    }

    @Override
    public Account loadAccount(String accountNumber) {
        for (Account account : accountlist) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    @Override
    public Collection<Account> getAccounts() {
        return accountlist;
    }
}
