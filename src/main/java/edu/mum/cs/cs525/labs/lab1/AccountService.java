package edu.mum.cs.cs525.labs.lab1;

import java.util.Collection;

public interface AccountService {
    Account createAccount(AccountType type, String accountNumber, String customerName);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
    void addInterest();
}
