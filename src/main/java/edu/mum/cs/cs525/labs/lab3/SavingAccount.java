package edu.mum.cs.cs525.labs.lab3;

public class SavingAccount extends Account {
    public SavingAccount(String accountNumber) {
        super(accountNumber);
        interest = new SavingInterest();
    }
}
